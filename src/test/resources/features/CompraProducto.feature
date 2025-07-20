@Regresion
Feature: Compra

  Scenario: Ingresa a la pantalla de compras
    Given realiza la compra del producto "Sauce Labs Backpack (orange)"
    When agrega el producto al carrito
    Then visualiza el carro con el producto


  Scenario Outline: Solicita la compra de un producto
    Given realiza la compra del producto "<PRODUCT>" con el "<NAME>", "<ADDRES>", "<CITY>", "<ZIP>" y "<COUNTRY>."
    When ingresa el "<NAME>" con su "<TC>", "<DATE TC>" y "<CODE>"
    Then visualiza la orden para "<NAME>", "<ADDRES>" y "<CITY>" confirmandola
    Examples:
      | PRODUCT                      | NAME             | ADDRES          | CITY  | ZIP     | COUNTRY  | TC               | DATE TC | CODE |
      | Sauce Labs Backpack (orange) | Samuel Gutierrez | Calle 23 #5 - 1 | Tunja | 150001  | Colombia | 1234543212345678 | 0630    | 287  |