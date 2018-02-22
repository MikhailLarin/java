package ru.mlarin.test.faker.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class FakerSessionHelper {
    protected WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    public void startFaker() {
      System.setProperty("webdriver.chrome.driver", "/home/mlarin/chromedriver");
      driver = new ChromeDriver();
      baseUrl = "https://www.google.com";
      driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public void exitFaker() {
      driver.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
      }
    }
}
