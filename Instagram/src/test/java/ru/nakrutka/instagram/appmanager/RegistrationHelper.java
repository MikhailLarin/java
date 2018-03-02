package ru.nakrutka.instagram.appmanager;

import org.openqa.selenium.By;

public class RegistrationHelper extends HelperBase {


    public RegistrationHelper(ApplicationManager app) {
        super(app);
    }

    public void start(String username, String email) {
        driver.get(app.getProperty("web.baseUrl"));
        type(By.name("emailOrPhone"),email);
        driver.findElement(By.name("fullName")).sendKeys("Nakrutka Instagram");
        type(By.name("username"),username);
        driver.findElement(By.name("password")).sendKeys("PAsssWord99");
        click(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[6]/span/button"));
    }
}
