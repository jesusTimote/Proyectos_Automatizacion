package com.automatizacion.prueba.steps.validacion;

import com.automatizacion.prueba.pages.validacion.validacionPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class validacionSteps extends validacionPage {

    @Step("Validar vizualizacion del modulo de productos")
    public Boolean titleIsVisible(){
        return lbl_product.isDisplayed();
    }

    @Step("Validar vizualizacion del mensaje de error ")
    public Boolean errorMenssageIsDisplayed(){
        return lbl_errorMenssage.isDisplayed();
    }

    @Step("Validar la lista de productos en el carrito")
    public Boolean productsAreDisplayed(){
        for(WebElementFacade product:productList){
            if(product.isDisplayed()){
                return true;
            }
        }
        return false;
    }
    @Step("Validar la lista de productos en el carrito que este vacia")
    public Boolean shoppingCartIsEmpty(){
        for(WebElementFacade product:productList){
            if(!product.isDisplayed()){
                return false;
            }
        }
        return true;
    }

    @Step("Validar finalizacion de orden")
    public Boolean orderTextIsDisplayed(){
        return lbl_order.isDisplayed();
    }
}
