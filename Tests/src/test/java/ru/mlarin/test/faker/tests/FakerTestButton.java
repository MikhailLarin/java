package ru.mlarin.test.faker.tests;

import org.testng.annotations.Test;

public class FakerTestButton extends FakerTestBase {

  @Test
  public void testFaker() throws Exception {
    app.getFakerHelper().isElementEnabled();

  }



}
