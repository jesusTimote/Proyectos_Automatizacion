package com.automatizacion.prueba.steps.shopping;

import com.automatizacion.prueba.pages.shopping.shoppingCartPage;
import net.thucydides.core.annotations.Step;

public class shoppingCartSteps extends shoppingCartPage {

    @Step("Click en checkout")
    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    @Step("Ingresar Nombre")
    public void typeFirstName(String firstname){
       txt_firstname.sendKeys(firstname);
    }

    @Step("Ingresar apellido")
    public void typeLastName(String lastname){
        txt_lastname.sendKeys(lastname);
    }

    @Step("Ingresar codigo postal")
    public void typePostal(String postal){
        txt_postal.sendKeys(postal);
    }

    @Step("Click en continuar")
    public void clickContinue(){
        continueButton.click();
    }

    @Step("Click en finalizar")
    public void clickFinish(){
       finishButton.click();
    }
}
