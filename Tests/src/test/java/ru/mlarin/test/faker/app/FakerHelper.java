package ru.mlarin.test.faker.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class FakerHelper {



    private final FakerSessionHelper fakerSessionHelper = new FakerSessionHelper();

    public void isButtonEnabled() {
      List<WebElement> buttons= fakerSessionHelper.driver.findElements(By.cssSelector(".btn.btn-outline-primary.btn-block"));
      for (WebElement button : buttons) {
        if (button.isEnabled()) {
          button.click();
          }

      }

    }
    public void uploadFile(File file) {



        fakerSessionHelper.driver.findElement(By.id("uploadFile")).sendKeys(file.getAbsolutePath());

        fakerSessionHelper.driver.findElement(By.id("submitUploadFile")).click();

    }

    public void getFaker() {
      fakerSessionHelper.driver.get("http://10.65.50.54:1313/setconfig");
    }

    public FakerSessionHelper getFakerSessionHelper() {
        return fakerSessionHelper;
    }
}
