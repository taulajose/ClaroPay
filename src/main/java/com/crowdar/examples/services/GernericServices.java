package com.crowdar.examples.services;

import com.crowdar.driver.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GernericServices {

    private static AndroidDriver driver = null;

    public void GenericServices(AndroidDriver driver) {
        this.driver = driver;
    }

    public static void clickAndHoldBckp(WebElement element) {
        AndroidDriver driver = (AndroidDriver) DriverManager.getDriverInstance().getWrappedDriver();
        Actions action = new Actions(driver);
        action.clickAndHold(element).build().perform();
    }
    public static RemoteWebDriver getDriver()
    {
        AndroidDriver driver = (AndroidDriver) DriverManager.getDriverInstance().getWrappedDriver();
        return driver;
    }
}
