package de.vinogradoff.inheritance;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class BaseBankAccountPage {

  public SelenideElement  accountNumber=$("#account");
  private SelenideElement details =$("#link");

  public void showDetails(){
    details.click();
  }
}
