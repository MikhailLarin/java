package ru.mlarin.test.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.mlarin.test.app.ApplicationManager;

public class Testing {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
      app.Driver();
      app.open();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
      app.quit();
    }

}
