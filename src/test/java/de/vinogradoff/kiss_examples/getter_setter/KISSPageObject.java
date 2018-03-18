package de.vinogradoff.kiss_examples.getter_setter;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class KISSPageObject {

  public SelenideElement  productName=$("#label");

  private SelenideElement submitBtn=$("#button");
  private SelenideElement followMe=$("#link");

  public void useElements(){
    submitBtn.click();
    followMe.click();
  }
}
