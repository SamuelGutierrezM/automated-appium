package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    AndroidDriver driver;

    public Driver() {
        try {
            this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), this.getDesiredCapabilities());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    public AndroidDriver getDriver() {
        return driver;
    }

    private DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", "16");
        desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appium:app", "/Users/davidsamuelgutierrezmonroy/Desktop/APK/mda-2.2.0-25.apk");
        desiredCapabilities.setCapability("appium:appWaitActivity", "*");
        desiredCapabilities.setCapability("appium:appWaitPackage", "com.saucelabs.mydemoapp.android");
        //desiredCapabilities.setCapability("appium:appWaitDuration", "50000");
        desiredCapabilities.setCapability("appium:autoGrantPermissions", "true");
        return desiredCapabilities;
    }
}
