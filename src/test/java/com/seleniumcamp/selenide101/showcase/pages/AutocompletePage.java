package com.seleniumcamp.selenide101.showcase.pages;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class AutocompletePage {

  public static SelenideElement stateInput = $("md-autocomplete[placeholder*='US state'] input"),
          autocompleteBox = $(".md-autocomplete-suggestions");


  public static void fill(String text) {
    stateInput.setValue(text);
  }

  /**
   * Selects the state from the box
   *
   * @param state either the part of the which is typed into autocomplete input box or the rest of the word
   *              e.g. if entered Calif, you can use either "Calif" or "ornia" as a parameter
   */
  public static void selectFromAutocompleteBox(String state) {
    autocompleteBox.find(byText(state)).click();
  }
}