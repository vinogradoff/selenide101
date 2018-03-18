package de.vinogradoff.kiss_examples.composition;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class KISSSavingAccountWidget {

  public SelenideElement  accountNumber=$("#account");
  public SelenideElement  interest=$("#interest");
  private SelenideElement details =$("#link");

  public void showDetails(){
    details.click();
  }
}
