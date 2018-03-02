package ru.nakrutka.instagram.tests;

import org.testng.annotations.Test;
import ru.nakrutka.instagram.appmanager.HttpSession;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class LoginTests extends TestBase {

    @Test
    public void testLogin() throws IOException {
        HttpSession session=app.newSession();
        assertTrue(session.login("lamishanya", "mixalich98larin"));
        assertTrue(session.isLoggedInAs("lamishanya"));
    }
}
