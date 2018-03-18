package de.vinogradoff.fluent;

import org.junit.Test;

import static com.codeborne.selenide.Condition.*;

public class KISSTest {

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
