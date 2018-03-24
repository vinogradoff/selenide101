package de.vinogradoff.kiss_examples.javadocs;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.$;

public class KISSPageObject {

  SelenideElement element=$("#element",1); // there are 3 #element-s, take second

  /**
   * Finds user in the table row, substring will be searched
   * Examples: findUser("lex",0) - finds Alexei
   * findUser("alex",0) - doesn't find Alexei
   * @param name case-sensitive, substring
   * @param row 0..N
   * @return SelenideElement representing a table row or null if not found.
   */
  public SelenideElement findUser(String name, int row ){
    return element;
  }
}
