package de.vinogradoff.fluent;

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
