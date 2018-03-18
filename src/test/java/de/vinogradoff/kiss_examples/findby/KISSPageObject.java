package de.vinogradoff.kiss_examples.findby;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class KISSPageObject {

  SelenideElement description=$("#text"),
                  submitBtn=$("#button"),
                  productName=$("#label"),
                  followMe=$("#link"),
                  passwordField=$("#textfield");

  public void useElements(){
    description.getText();
    submitBtn.click();
    productName.shouldBe(visible);
    followMe.click();
    passwordField.setValue("password");
  }
}
