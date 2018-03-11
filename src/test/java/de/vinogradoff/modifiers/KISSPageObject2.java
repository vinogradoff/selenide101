package de.vinogradoff.modifiers;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class KISSPageObject2 {

  public SelenideElement  productName=$("label");

  private SelenideElement submitBtn=$("#button");
  private SelenideElement followMe=$("#link");
  private SelenideElement passwordField=$("#textfield");
  private SelenideElement description=$("#text");

  public void useElements(){
    description.getText();
    submitBtn.click();
    followMe.click();
    passwordField.setValue("password");
  }
}