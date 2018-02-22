package ru.mlarin.test.faker.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FakerHelper {



    private final FakerSessionHelper fakerSessionHelper = new FakerSessionHelper();

    public void isElementEnabled() {
      List<WebElement> buttons= fakerSessionHelper.driver.findElements(By.cssSelector(".btn.btn-outline-primary.btn-block"));
      for (WebElement button : buttons) {
        if (button.isEnabled()) {
          button.click();
          }

      }

    }

    public void getFaker() {
      fakerSessionHelper.driver.get("http://10.65.50.54:1313/setconfig");
    }

    public FakerSessionHelper getFakerSessionHelper() {
        return fakerSessionHelper;
    }
}
