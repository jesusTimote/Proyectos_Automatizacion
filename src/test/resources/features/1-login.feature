@Login
Feature: CP01 - Validar inicio de sesion

  Background: Validar el inicio de sesion con las credenciales validas
    Given el usuario navega en el sitio web

  @ValidCredentials
  Scenario: 1- Validar con credenciales correctas
    When Ingresa credenciales validas
    Then la aplicacion deberia mostrar el modulo principal de productos

  Scenario: 2- Validar con credenciales Incorrecta
    When Ingresa credenciales invalidas
    Then la aplicacion deberia mostrar un mensaje de error

