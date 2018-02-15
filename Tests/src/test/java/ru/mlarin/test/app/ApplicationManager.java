package ru.mlarin.test.app;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
    public WebDriver driver;
    public String baseUrl;
    public StringBuffer verificationErrors = new StringBuffer();
    private boolean acceptNextAlert = true;

    public void Driver() {
      System.setProperty("webdriver.chrome.driver", "/home/mlarin/chromedriver");
      driver = new ChromeDriver();
    }

    public void getYandex() {
      driver.get("https://www.google.ru/search?q=yandex&oq=ya&aqs=chrome.0.69i59j69i57j69i60j0l2j69i60.3842j0j4&sourceid=chrome&ie=UTF-8");
      driver.findElement(By.linkText("Яндекс")).click();
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

    public void open() {
      baseUrl = "https://www.google.com/";
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void quit() {
      driver.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
      }
    }
}
