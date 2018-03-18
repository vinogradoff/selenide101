package de.vinogradoff.fluent;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class KISSDetailsWidget {

  public SelenideElement  productName=$("#label");
  private SelenideElement details =$("#link");

  public void showDetails(){
    details.click();
  }
}
