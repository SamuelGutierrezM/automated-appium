package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.MainScreen;
import utils.Driver;

public class ProductSteps {

    MainScreen mainScreen;

    String productGeneral = "";

    @Given("realiza la compra del producto {string}")
    public void realizaLaCompraDelProducto(String product) {
        mainScreen = new MainScreen(new Driver().getDriver());
        this.mainScreen.clickMenuButton();
        this.mainScreen.clickLoginMenuButton();
        this.mainScreen.clickUserOne();
        this.mainScreen.clickLogin();
        this.mainScreen.seleccionarProductos(product);
        productGeneral = product;
    }

    @When("agrega el producto al carrito")
    public void agregaElProductoAlCarrito() {
        this.mainScreen.clickAddProduct();
        this.mainScreen.clickCart();
    }

    @Then("visualiza el carro con el producto")
    public void visualizaElCarroConElProducto() {
        this.mainScreen.labelCart().equals("My Cart");
        this.mainScreen.labelProduct().equals(productGeneral);
    }
}
