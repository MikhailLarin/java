package ru.mlarin.test.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.mlarin.test.app.FakerAppManager;

import java.util.concurrent.TimeUnit;

public class FakerTestBase {

    protected final FakerAppManager app = new FakerAppManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
      app.driver();
      app.start();
      app.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
      app.exit();
    }

}
