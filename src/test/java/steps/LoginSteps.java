package steps;

import io.cucumber.java.en.*;
import screens.MainScreen;
import utils.Driver;

public class LoginSteps {

    MainScreen mainScreen;

    @Given("ingresa al login")
    public void ingresaAlLogin() {
        mainScreen = new MainScreen(new Driver().getDriver());
        this.mainScreen.clickMenuButton();
        this.mainScreen.clickLoginMenuButton();
        this.mainScreen.title().equals("Login");
    }

    @When("ingresa el usuario {string} con la contraseña {string}")
    public void ingresaElUsuarioConLaContraseña(String user, String pasword) {
        this.mainScreen.sendUsername(user);
        this.mainScreen.sendPasword(pasword);
        this.mainScreen.clickLogin();
    }

    @When("visualiza los productos")
    public void visualizaLosProductos() {
        this.mainScreen.labelProducts().equals("Products");
    }

    @When("ingresa el usuario {string}")
    public void ingresaElUsuario(String user) {
        this.mainScreen.sendUsername(user);
        this.mainScreen.clickLogin();
    }

    @Then("visualiza el error {string}")
    public void visualizaElError(String error) {
        this.mainScreen.labelPaswordError().equals(error);
    }

    @Then("visualiza el error de usuario no encontrado {string}")
    public void visualizaElErrorDeUsuario(String error) {
        this.mainScreen.labelUserError().equals("");
    }

    @When("ingresa sin credenciales")
    public void ingresaSinCredenciales() {
        this.mainScreen.clickLogin();
    }

    @When("ingresa el usuario dos")
    public void ingresaElUsuarioDos() {
        this.mainScreen.clickuserTwo();
        this.mainScreen.clickLogin();
    }
}
