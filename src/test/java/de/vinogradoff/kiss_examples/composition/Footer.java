package de.vinogradoff.kiss_examples.composition;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

// KISS Widget
public class Footer {

  public ElementsCollection links=$$("#links");
  public SelenideElement copyright=$("#copyright");
}
