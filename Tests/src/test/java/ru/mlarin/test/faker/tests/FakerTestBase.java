package ru.mlarin.test.faker.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.mlarin.test.faker.app.FakerAppManager;

public class FakerTestBase {
    protected final FakerAppManager app = new FakerAppManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
      app.getFakerHelper().getFakerSessionHelper().startFaker();
      app.getFakerHelper().getFaker();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
      app.getFakerHelper().getFakerSessionHelper().exitFaker();
    }

}
