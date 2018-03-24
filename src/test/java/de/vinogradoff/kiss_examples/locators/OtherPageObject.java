package de.vinogradoff.kiss_examples.locators;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Condition.visible;

public class OtherPageObject {

  SelenideElement description=Locators.DESCRIPTION,
                  submitBtn=Locators.SUBMIT,
                  productName=Locators.LABEL;

  public void useElements(){
    description.getText();
    submitBtn.click();
    productName.shouldBe(visible);
  }
}