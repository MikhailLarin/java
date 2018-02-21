package ru.mlarin.test.faker;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class FakerTestButton {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "/home/mlarin/chromedriver");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com";
    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
  }

  @Test
  public void testFaker() throws Exception {
    driver.get("http://10.65.50.54:1313/setconfig");
    Assert.assertEquals(isElementEnabled(), true);

  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
  public boolean isElementEnabled() {
    List<WebElement> buttons=driver.findElements(By.cssSelector(".btn.btn-outline-primary.btn-block"));
    for (WebElement button : buttons) {
      if (button.isEnabled()) {
        return false;
        }

    }
    return true;
  }


//  private boolean isElementEnabled(String locator) {
//    if (driver.findElement(By.id(locator)).isEnabled()) {//
//      return true;
//    } else {
//      return false;
//    }
//  }

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
