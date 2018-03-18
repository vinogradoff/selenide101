package de.vinogradoff.kiss_examples.composition;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.$;

// KISS Widget
public class Header {

  public SelenideElement menu=$("#menu");
  public SelenideElement logo=$("#logo");
}
