package ru.mlarin.test.faker.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPTest {

    @DataProvider
    public Object[][] translationDP(){
        return new Object[][]{
                {"click","нажать"},
                {"copy","копировать"},
                {"paste","вставить"},
                {"run","бежать"},

        };
    }
    @Test(dataProvider = "translationDP")
    public void translationTest(String en, String ru){
        System.out.println(en +" = " +ru);
    }


}
