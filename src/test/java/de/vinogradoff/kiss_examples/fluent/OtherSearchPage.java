package de.vinogradoff.kiss_examples.fluent;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class OtherSearchPage {

  private SelenideElement search =$("#button");

  public OtherDetailsPage search(){
    search.click();
    return new OtherDetailsPage();
  }

}
