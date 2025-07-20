package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import screens.MainScreen;
import utils.Driver;

public class CheckoutSteps {

    MainScreen mainScreen;

    String productGlobal;

    @Given("realiza la compra del producto {string} con el {string}, {string}, {string}, {string} y {string}")
    public void realizaLaCompraDelProductoConElNombreDireccionCiudadCodeYPais(String product, String name, String addres, String city, String code, String country) {
        mainScreen = new MainScreen(new Driver().getDriver());
        this.mainScreen.clickMenuButton();
        this.mainScreen.clickLoginMenuButton();
        this.mainScreen.clickUserOne();
        this.mainScreen.clickLogin();
        this.mainScreen.seleccionarProductos(product);
        this.mainScreen.clickAddProduct();
        this.mainScreen.clickCart();
        this.mainScreen.clickCheckout();
        this.mainScreen.sendName(name);
        this.mainScreen.sendAddress(addres);
        this.mainScreen.sendCity(city);
        this.mainScreen.sendZipCode(code);
        this.mainScreen.sendCountry(country);
        this.mainScreen.clickPayment();
        productGlobal = product;
    }

    @When("ingresa el {string} con su {string}, {string} y {string}")
    public void ingresaElConSuY(String name,String tc, String date, String code) {
        this.mainScreen.sendUsername(name);
        this.mainScreen.sendTC(tc);
        this.mainScreen.sendDateTC(date);
        this.mainScreen.sendCodeTC(code);
        this.mainScreen.clickPReviewOrder();
    }


    @Then("visualiza la orden para {string}, {string} y {string} confirmandola")
    public void visualizaLaOrdenParaYConfirmandola(String name, String addres, String city) {
        this.mainScreen.labelProduct().equals(productGlobal);
        this.mainScreen.labelReviewName().equals(name);
        this.mainScreen.labelReviewAddres().equals(addres);
        this.mainScreen.labelReviewCity().contains(city);
        this.mainScreen.clickPReviewOrder();
        this.mainScreen.labelCheckoutComplete();
    }

}
