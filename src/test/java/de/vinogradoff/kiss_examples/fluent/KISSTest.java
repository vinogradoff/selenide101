package de.vinogradoff.kiss_examples.fluent;

import org.junit.*;

import static com.codeborne.selenide.Condition.*;

public class KISSTest {

  @BeforeClass
  public static void warning(){
    Assert.fail("These are just building block examples. Don't run them.\n" +
            "Этот код содержит только схематичные примеры. Не запускайте его");
  }

  @Test
  public void testProductName(){

    new KISSSearchWidget().search();

    KISSDetailsWidget kissDetailsWidget = new KISSDetailsWidget();
    kissDetailsWidget.showDetails();
    kissDetailsWidget.productName.shouldBe(visible);

    // also okay
    new KISSDetailsWidget().showDetails();
    new KISSDetailsWidget().productName.shouldBe(visible);
  }
}
