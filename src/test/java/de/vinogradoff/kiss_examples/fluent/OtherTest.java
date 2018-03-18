package de.vinogradoff.kiss_examples.fluent;

import org.junit.Test;

import static com.codeborne.selenide.Condition.*;

public class OtherTest {

  @Test
  public void testProductName(){

    new OtherSearchPage().search()
            .showDetails()
            .productName.shouldBe(visible);
  }
}
