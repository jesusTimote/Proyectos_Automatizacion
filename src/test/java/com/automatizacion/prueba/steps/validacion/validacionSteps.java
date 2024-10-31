package com.automatizacion.prueba.steps.validacion;

import com.automatizacion.prueba.pages.validacion.validacionPage;
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
}
