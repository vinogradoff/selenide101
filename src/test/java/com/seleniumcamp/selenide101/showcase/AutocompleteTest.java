package com.seleniumcamp.selenide101.showcase;

import com.seleniumcamp.selenide101.showcase.pages.*;
import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class AutocompleteTest {

  @BeforeClass
  public static void openSite() {
    open("/demo/autocomplete");
  }

  @Test
  public void autocompleteShowsUsStates() {
    AutocompletePage.fill("V");
    AutocompletePage.autocompleteBox.shouldHave(text("Virginia"))
            .shouldHave(text("Vermont"))
            .shouldNotHave(text("Alaska"));
    AutocompletePage.selectFromAutocompleteBox("irginia");
    AutocompletePage.stateInput.shouldHave(value("Virginia"));
  }
}
