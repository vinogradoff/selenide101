package de.vinogradoff.kiss_examples.fluent;

import org.junit.*;

import static com.codeborne.selenide.Condition.*;

public class OtherTest {

  @BeforeClass
  public static void warning(){
    Assert.fail("These are just building block examples. Don't run them.\n" +
            "Этот код содержит только схематичные примеры. Не запускайте его");
  }

  @Test
  public void testProductName(){

    new OtherSearchPage().search()
            .showDetails()
            .productName.shouldBe(visible);
  }
}
