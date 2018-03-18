package de.vinogradoff.kiss_examples.fluent;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class OtherDetailsPage {

  public SelenideElement  productName=$("#label");
  private SelenideElement details =$("#link");

  public OtherDetailsPage showDetails(){
    details.click();
    return this;
  }
}
