package com.automatizacion.prueba.pages.validacion;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class validacionPage extends PageObject {

    @FindBy(xpath = "//div[@class='product_label']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//h3[@data-test='error' and text()='Username and password do not match any user in this service']")
    protected WebElementFacade lbl_errorMenssage;
}
