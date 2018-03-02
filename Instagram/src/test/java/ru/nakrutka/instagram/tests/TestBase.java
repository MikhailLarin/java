package ru.nakrutka.instagram.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.nakrutka.instagram.appmanager.ApplicationManager;

import java.io.IOException;

public class TestBase {
    protected static final ApplicationManager app
            = new ApplicationManager(System.getProperty("browser", org.openqa.selenium.remote.BrowserType.CHROME));

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
       // app.ftp().upload(new File("src/test/resources/config_inc.php"), "config_inc.php","config_inc.php.bak");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws IOException {
        // app.ftp().restore("config_inc.php.bak","config_inc.php");
        app.stop();
    }

}
