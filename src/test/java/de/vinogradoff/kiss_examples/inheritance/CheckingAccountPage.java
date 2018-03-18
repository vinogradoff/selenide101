package de.vinogradoff.kiss_examples.inheritance;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class CheckingAccountPage extends BaseBankAccountPage{

  public SelenideElement  balance=$("#balance");

}
