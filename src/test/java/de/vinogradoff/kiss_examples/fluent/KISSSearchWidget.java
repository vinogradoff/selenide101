package de.vinogradoff.kiss_examples.fluent;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class KISSSearchWidget {

  private SelenideElement search =$("#button");

  public void search(){
    search.click();
  }

}
