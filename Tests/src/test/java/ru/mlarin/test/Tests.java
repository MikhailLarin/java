package ru.mlarin.test;

import org.testng.annotations.Test;
import ru.mlarin.test.tests.Testing;

public class Tests extends Testing {

  @Test
  public void test() throws Exception {
    app.getYandex();
  }

}
