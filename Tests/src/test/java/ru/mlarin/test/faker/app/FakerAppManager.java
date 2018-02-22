package ru.mlarin.test.faker.app;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;

public class FakerAppManager {
    private final FakerHelper fakerHelper = new FakerHelper();
    private boolean acceptNextAlert = true;

    private boolean isElementPresent(By by) {
      try {
        fakerHelper.getFakerSessionHelper().driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        fakerHelper.getFakerSessionHelper().driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    private String closeAlertAndGetItsText() {
      try {
        Alert alert = fakerHelper.getFakerSessionHelper().driver.switchTo().alert();
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

    public FakerHelper getFakerHelper() {
        return fakerHelper;
    }
}
