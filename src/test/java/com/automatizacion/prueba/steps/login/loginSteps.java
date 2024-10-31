package com.automatizacion.prueba.steps.login;

import com.automatizacion.prueba.pages.login.loginPage;
import net.thucydides.core.annotations.Step;

public class loginSteps extends loginPage {

    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("Click en el botton de login")
    public void clickBtutton(){
        btn_login.click();
    }
}
