package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.MainScreen;
import utils.Driver;

public class MainSteps {

    MainScreen mainScreen;

    @Given("ingresa a la aplicacion")
    public void ingresaALaAplicacion() {
        mainScreen = new MainScreen(new Driver().getDriver());
    }

    @When("navega al login")
    public void navegaAlLogin() {
        this.mainScreen.clickMenuButton();
        this.mainScreen.clickLoginMenuButton();
    }

    @Then("visualiza el login")
    public void visualizaElLogin() {
        this.mainScreen.title().equals("Login");
    }
}
