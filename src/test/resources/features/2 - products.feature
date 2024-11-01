@ShoppingCard
Feature: CP02 - Validar carrito de compras
  Background: Realizar 3 validacionesen el carrito de compras
    Given el usuario navega en el sitio web
    When Ingresa credenciales validas

    @ShoppingCardList
    Scenario: 1 - Listar los productosen el carrito de compras
      And agrega productos al carrito de compras
      And da click en el icono del carrito
      Then el sistema deberia listar los productos agregados en el carrito de compras

    @ShoppingCardEmpty
    Scenario: 2 - Cuando se quiere procesar la compra, se debe mostrar un mensaje de compra exitosa
      And da click en el icono del carrito
      Then el sistema deberia mostrar la cesta sin productos

    @ShoppingCardProcess
    Scenario: 3 - Cuando la cesta este vacia de productos, no procesar la compra
      And agrega productos al carrito de compras
      And da click en el icono del carrito
      When completa todo el registro de la orden
      Then el sistema deberia procesar la compra

