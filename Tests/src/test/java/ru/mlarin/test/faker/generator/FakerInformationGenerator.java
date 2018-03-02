package ru.mlarin.test.faker.generator;

import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class FakerInformationGenerator {
    public static void main(String[] args) {
       int count = Integer.parseInt(args[0]);
       File file = new File(args[1]);

        List<WebElement> buttons = generateButtons(count);
        save(buttons,file);

    }

    private static void save(List<WebElement> buttons, File file) {

    }

    private static List<WebElement> generateButtons(int count) {

        return null;
    }

}
