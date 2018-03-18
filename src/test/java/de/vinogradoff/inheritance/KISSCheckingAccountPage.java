package de.vinogradoff.inheritance;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class KISSCheckingAccountPage {

  public SelenideElement  accountNumber=$("#account");
  public SelenideElement  balance=$("#balance");
  private SelenideElement details =$("#link");

  public void showDetails(){
    details.click();
  }
}
