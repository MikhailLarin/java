package ru.mlarin.test;

import org.testng.annotations.Test;
import ru.mlarin.test.tests.FakerTestBase;

public class FakerTestButton extends FakerTestBase {

  @Test
  public void testFaker() throws Exception {
    app.getFaker();
    app.find();
  }

}
