package screens.base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BaseScreen {

    protected AndroidDriver driver;
    protected WebDriverWait wait;

    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver,10);
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public void waitToBeClick(WebElement element) {
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitToBeVisuble(WebElement element) {
        this.wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element) {
        this.waitToBeClick(element);
        element.click();
    }

    public void sendKeys(WebElement element, String keys) {
        this.waitToBeVisuble(element);
        element.sendKeys(keys);
    }

    public String getText(WebElement element) {
        this.waitToBeVisuble(element);
        return element.getText();
    }

    public List<String> obtenerTextosProductos(List<MobileElement> productos) {
        List<String> textos = new ArrayList<>();
        for (MobileElement producto : productos) {
            if (producto.isDisplayed()) {
                textos.add(producto.getText());
            }
        }
        return textos;
    }
}
