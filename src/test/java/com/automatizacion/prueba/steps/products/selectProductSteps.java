package com.automatizacion.prueba.steps.products;

import com.automatizacion.prueba.pages.products.selectProductPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class selectProductSteps extends selectProductPage {

    @Step("Agregar productos al carrito de compras")
    public void addProducts(int quantity) {
        for(int i=0; i<quantity;i++){
            Actions act =new Actions(getDriver());
            act.click(products.get(i)).perform();


        }
    }
    @Step("click en el icono del carrito de cpmpras")
    public void clickShoppingCartIcon(){
        shoppingCartIcon.click();
    }
}
