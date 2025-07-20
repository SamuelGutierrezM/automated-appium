package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.MainScreen;
import utils.Driver;

public class MainScreenTest {

    private MainScreen mainScreen;

    @BeforeTest
    public void preTest() {
        this.mainScreen = new MainScreen(new Driver().getDriver());
    }

    @Test
    public void loginScreenTest() {
        this.mainScreen.clickMenuButton();
        this.mainScreen.clickLoginMenuButton();
    }

}
