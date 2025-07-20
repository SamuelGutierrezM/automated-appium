package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import screens.base.BaseScreen;

import java.util.Collections;
import java.util.List;

public class MainScreen extends BaseScreen {

    public MainScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "View menu")
    private WebElement menuButton;

    @AndroidFindBy(accessibility = "Login Menu Item")
    private WebElement loginMenu;

    public void clickMenuButton() {
        this.clickElement(this.menuButton);
    }

    public void clickLoginMenuButton() {
        this.clickElement(this.loginMenu);
    }

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/username1TV")
    private WebElement userOne;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    private WebElement userName;

    @AndroidFindBy(accessibility = "Tap to login with given credentials")
    private WebElement login;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/selectTextTV\"]")
    private WebElement labelTitle;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordET")
    private WebElement pasword;


    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameErrorTV")
    private WebElement labelErrorUser;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordErrorTV")
    private WebElement labelErrorPasword;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/username2TV")
    private WebElement userTwo;


    public void clickUserOne() {
        this.clickElement(this.userOne);
    }

    public void clickLogin() {
        this.clickElement(this.login);
    }

    public String title() {
        return this.getText(this.labelTitle);
    }

    public void sendUsername(String user) {
        this.sendKeys(this.userName, user);
    }

    public void sendPasword(String user) {
        this.sendKeys(this.pasword, user);
    }

    @AndroidFindBy(accessibility = "title")
    private WebElement labelProducts;

    public String labelProducts() {
        return this.getText(this.labelProducts);
    }

    public String labelUserError() {
        return this.getText(this.labelErrorUser);
    }

    public String labelPaswordError() {
        return this.getText(this.labelErrorPasword);
    }

    public void clickuserTwo() {
        this.clickElement(this.userTwo);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Product Title\"]")
    private List<MobileElement> products;

    public MobileElement obtenerProductoPorIndice(int posicion) {
        String uiSelector = "new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/productIV\").instance(" + posicion + ")";
        return (MobileElement) ((AndroidDriver) driver).findElementByAndroidUIAutomator(uiSelector);
    }


    int a = 0;
    public void seleccionarProductos(String textoBuscado) {
        List<String> elementos = this.obtenerTextosProductos(this.products);
        for (int i = 0; i < elementos.size(); i++) {
            String textoElemento = elementos.get(i);
            if (textoElemento.contentEquals(textoBuscado)) {
                a = i;
            }
        }
        MobileElement producto = obtenerProductoPorIndice(a);
        producto.click();

    }

    @AndroidFindBy(accessibility = "Tap to add product to cart")
    private WebElement buttonAddProduct;

    public void clickAddProduct() {
        this.clickElement(this.buttonAddProduct);
    }

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private WebElement buttonCart;

    public void clickCart() {
        this.clickElement(this.buttonCart);
    }

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement labelCart;

    public String labelCart() {
        return this.getText(this.labelCart);
    }

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private WebElement labelProduct;

    public String labelProduct() {
        return this.getText(this.labelProduct);
    }

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement buttonCheckout;

    public void clickCheckout() {
        this.clickElement(this.buttonCheckout);
    }



    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/fullNameET")
    private WebElement txtName;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/address1ET")
    private WebElement txtAddress;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cityET")
    private WebElement txtCity;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/zipET")
    private WebElement txtZipCode;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/countryET")
    private WebElement txtACountry;

    @AndroidFindBy(accessibility = "Saves user info for checkout")
    private WebElement buttonPay;

    public void sendName(String name) {
        this.sendKeys(this.txtName, name);
    }

    public void sendAddress(String name) {
        this.sendKeys(this.txtAddress, name);
    }

    public void sendCity(String name) {
        this.sendKeys(this.txtCity, name);
    }

    public void sendZipCode(String name) {
        this.sendKeys(this.txtZipCode, name);
    }

    public void sendCountry(String name) {
        this.sendKeys(this.txtACountry, name);
    }

    public void clickPayment() {
        this.clickElement(this.buttonPay);
    }



    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cardNumberET")
    private WebElement txtCard;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/expirationDateET")
    private WebElement txtDateTC;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/securityCodeET")
    private WebElement txtCodeTC;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/paymentBtn")
    private WebElement ButtonReviewOrder;

    public void sendNameTC(String name) {
        this.sendKeys(this.userName, name);
    }

    public void sendTC(String card) {
        this.sendKeys(this.txtCard, card);
    }

    public void sendDateTC(String code) {
        this.sendKeys(this.txtDateTC, code);
    }

    public void sendCodeTC(String code) {
        this.sendKeys(this.txtCodeTC, code);
    }

    public void clickPReviewOrder() {
        this.clickElement(this.ButtonReviewOrder);
    }



    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/fullNameTV")
    private WebElement txtReviewName;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/addressTV")
    private WebElement txtReviewAddres;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cityTV")
    private WebElement txtReviewCity;

    public String labelReviewName() {
        return this.getText(this.txtReviewName);
    }

    public String labelReviewAddres() {
        return this.getText(this.txtReviewAddres);
    }

    public String labelReviewCity() {
        return this.getText(this.txtReviewCity);
    }



    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/completeTV")
    private WebElement txtCheckouComplete;

    public String labelCheckoutComplete() {
        return this.getText(this.txtCheckouComplete);
    }



}
