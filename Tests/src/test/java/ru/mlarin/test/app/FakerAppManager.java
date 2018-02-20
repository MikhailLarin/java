package ru.mlarin.test.app;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.fail;

public class FakerAppManager {
    public WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public void start() {
        baseUrl = "https://www.google.com/";
    }

    public void driver() {
        System.setProperty("webdriver.chrome.driver", "/home/mlarin/chromedriver");
        driver = new ChromeDriver();
    }

    public void find() {
        driver.findElement(By.id("head")).click();
    }

    public void getFaker() {
        driver.get("http://10.65.50.54:1313/setconfig");
    }
    public void click() {
        driver.findElement(By.id("submitApplyServerAddress")).click();
        driver.findElement(By.id("submitApplyGlobalDelay")).click();
        driver.findElement(By.id("submitApplyReply")).click();
        driver.findElement(By.id("submitApplyTextAreaConfig")).click();

    }


    public void exit() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}