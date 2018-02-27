package ru.mlarin.test.faker.tests;

import org.testng.annotations.Test;

import java.io.File;

public class FakerUploadFileTest extends  FakerTestBase{
    @Test
    public void testUploadFileOnFaker() throws Exception{
        app.getFakerHelper().uploadFile(new File("/src/test/resources/faker.json"));

    }
}
