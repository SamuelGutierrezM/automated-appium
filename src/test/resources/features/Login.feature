@Regresion
Feature: Login

  Scenario: Ingresa a la pantalla de login
    Given ingresa a la aplicacion
    When navega al login
    Then visualiza el login

  Scenario: Ingresa las credenciales de manera exitosa
    Given ingresa al login
    When ingresa el usuario "bod@example.com" con la contraseña "10203040"
    Then visualiza los productos

  Scenario: Ingresa sin credenciales e intenta ingresa
    Given ingresa al login
    When ingresa sin credenciales
    Then visualiza el error de usuario no encontrado "Username is required"

  Scenario: Ingresa solo con usuario e intenta ingresa
    Given ingresa al login
    When ingresa el usuario "bod@example.com"
    Then visualiza el error "Enter Pasword"

  Scenario: Ingresa con un usuario bloqueado
    Given ingresa al login
    When ingresa el usuario dos
    Then visualiza el error "Sorry this user has been locked out."
