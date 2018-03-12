package de.vinogradoff.getter_setter;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class OtherPageObject {

  private SelenideElement  productName=$("#label");

  public SelenideElement getProductName() {
    return productName;
  }

  private SelenideElement submitBtn=$("#button");
  private SelenideElement followMe=$("#link");

  public void useElements(){
    submitBtn.click();
    followMe.click();
  }
}
