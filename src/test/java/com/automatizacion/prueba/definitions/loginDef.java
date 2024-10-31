package com.automatizacion.prueba.definitions;

import com.automatizacion.prueba.steps.login.loginSteps;
import com.automatizacion.prueba.steps.validacion.validacionSteps;
import com.automatizacion.prueba.utilities.website.website;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class loginDef {


    @Steps(shared = true)
    website url;

    @Steps(shared = true)
    loginSteps login;

    @Steps(shared = true)
    validacionSteps validateLogin;

    @Given("el usuario navega en el sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("Ingresa credenciales validas")
    public void ingresaCredencialesValidas() {
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.clickBtutton();
    }

    @Then("la aplicacion deberia mostrar el modulo principal de productos")
    public void laAplicacionDeberiaMostrarElModuloPrincipalDeProductos() {
        Assert.assertTrue(validateLogin.titleIsVisible());
    }

    @When("Ingresa credenciales invalidas")
    public void ingresaCredencialesInvalidas() {
        login.typeUsername("standard_user");
        login.typePassword("secret_sau90");
        login.clickBtutton();
    }

    @Then("la aplicacion deberia mostrar un mensaje de error")
    public void laAplicacionDeberiaMostrarUnMensajeDeError() {
        Assert.assertTrue(validateLogin.errorMenssageIsDisplayed());
    }
}
