package de.vinogradoff.fluent;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class KISSSearchWidget {

  private SelenideElement search =$("#button");

  public void search(){
    search.click();
  }

}
