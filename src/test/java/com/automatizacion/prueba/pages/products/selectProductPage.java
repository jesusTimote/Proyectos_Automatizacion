package com.automatizacion.prueba.pages.products;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class selectProductPage extends PageObject {

    @FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
    protected List<WebElementFacade> products;

    @FindBy(xpath = "//*[local-name()='svg']//ancestor::a")
    protected WebElementFacade shoppingCartIcon;
}
