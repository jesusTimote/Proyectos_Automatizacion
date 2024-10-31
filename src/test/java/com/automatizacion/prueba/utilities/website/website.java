package com.automatizacion.prueba.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class website {

    @Steps(shared = true)
    PageObject swag;

    @Step("Navegar sitio Web")
    public void navigateTo(String url){
        swag.setDefaultBaseUrl(url);
        swag.open();
    }



}
