package ru.nakrutka.instagram.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationHelper {
    private final ApplicationManager app;
    private WebDriver driver;
    public RegistrationHelper(ApplicationManager app) {
        this.app = app;
        driver =app.getDriver();
    }

    public void start(String username, String email) {
        driver.get(app.getProperty("web.baseUrl")+"/?hl=ru");
        driver.findElement(By.id("fee8b93ef1faf8")).sendKeys(email);
    }
}
