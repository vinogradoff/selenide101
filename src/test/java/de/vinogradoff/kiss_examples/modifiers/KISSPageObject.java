package de.vinogradoff.kiss_examples.modifiers;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class KISSPageObject {

  public SelenideElement productName=$("#label");

  SelenideElement        submitBtn=$("#button");
  SelenideElement        followMe=$("#link");
  SelenideElement        passwordField=$("#textfield");
  SelenideElement        description=$("#text");

  public void useElements(){
    description.getText();
    submitBtn.click();
    followMe.click();
    passwordField.setValue("password");
  }
}