package com.seleniumcamp.selenide101.showcase;

import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class AutocompleteTest {

  @Test
  public void autocompleteShowsUsStates(){
    open("https://material.angularjs.org/latest/demo/autocomplete");
    $("md-autocomplete[placeholder*='US state'] input").setValue("V");
    $(".md-autocomplete-suggestions").shouldHave(text("Virginia"))
            .shouldHave(text("Vermont"))
            .shouldNotHave(text("Alaska"));
    $(".md-autocomplete-suggestions").find(byText("irginia")).click();
    $("md-autocomplete[placeholder*='US state'] input").shouldHave(value("Virginia"));

  }
}
