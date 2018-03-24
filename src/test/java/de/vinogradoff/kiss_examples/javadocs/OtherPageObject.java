package de.vinogradoff.kiss_examples.javadocs;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class OtherPageObject {

  SelenideElement element=$("#element",1);

  /**
   * Finds user in the table row
   */
  public SelenideElement findUser(String name, int row ){
    return element;
  }
}
