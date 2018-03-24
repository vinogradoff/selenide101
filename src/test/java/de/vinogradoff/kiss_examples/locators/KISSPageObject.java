package de.vinogradoff.kiss_examples.locators;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class KISSPageObject {

  SelenideElement description=$("#text"),
          submitBtn=$("#button"),
          productName=$("#label");

  public void useElements(){
    description.getText();
    submitBtn.click();
    productName.shouldBe(visible);
  }
}