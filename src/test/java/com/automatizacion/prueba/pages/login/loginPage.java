package com.automatizacion.prueba.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class loginPage extends PageObject {

    @FindBy(id="user-name")
    protected WebElementFacade txt_username;

    @FindBy(id="password")
    protected WebElementFacade txt_password;

    @FindBy(id="login-button")
    protected WebElementFacade btn_login;

}
