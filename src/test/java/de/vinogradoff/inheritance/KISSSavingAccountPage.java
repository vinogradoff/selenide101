package de.vinogradoff.inheritance;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class KISSSavingAccountPage {

  public SelenideElement  accountNumber=$("#account");
  public SelenideElement  interest=$("#interest");
  private SelenideElement details =$("#link");

  public void showDetails(){
    details.click();
  }
}
