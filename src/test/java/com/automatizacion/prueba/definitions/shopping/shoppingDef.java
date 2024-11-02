package com.automatizacion.prueba.definitions.shopping;

import com.automatizacion.prueba.steps.products.selectProductSteps;
import com.automatizacion.prueba.steps.shopping.shoppingCartSteps;
import com.automatizacion.prueba.steps.validacion.validacionSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class shoppingDef {
    @Steps(shared = true)
    selectProductSteps selectProduct;

    @Steps(shared = true)
    validacionSteps validate;

    @Steps(shared = true)
    shoppingCartSteps shoppingCart;

    @And("agrega productos al carrito de compras")
    public void userAddProducts(){
        selectProduct.addProducts(3);
    }

    @And("da click en el icono del carrito")
    public void daClickEnElIconoDelCarrito() {
        selectProduct.clickShoppingCartIcon();
    }

    @Then("el sistema deberia listar los productos agregados en el carrito de compras")
    public void elSistemaDeberiaListarLosProductosAgregadosEnElCarritoDeCompras() {
        Assert.assertTrue(validate.productsAreDisplayed());
    }

    @Then("el sistema deberia mostrar la cesta sin productos")
    public void elSistemaDeberiaMostrarLaCestaSinProductos() {
        Assert.assertTrue(validate.shoppingCartIsEmpty());
    }

    @When("completa todo el registro de la orden")
    public void completaTodoElRegistroDeLaOrden() {
        shoppingCart.clickCheckoutButton();
        shoppingCart.typeFirstName("JORGE");
        shoppingCart.typeLastName("GONZALES");
        shoppingCart.typePostal("0012");
        shoppingCart.clickContinue();
        shoppingCart.clickFinish();
    }

    @Then("el sistema deberia procesar la compra")
    public void elSistemaDeberiaProcesarLaCompra() {
        Assert.assertTrue(validate.orderTextIsDisplayed());
    }
}
