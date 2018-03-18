package de.vinogradoff.kiss_examples.getter_setter;

import org.junit.Test;

import static com.codeborne.selenide.Condition.*;

public class KISSTest {

  @Test
  public void testProductName(){
    new KISSPageObject().productName.shouldBe(visible);
  }
}
