package de.vinogradoff.kiss_examples.inheritance;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class SavingAccountPage extends BaseBankAccountPage{

  public SelenideElement interestRate=$("#interest");

}
