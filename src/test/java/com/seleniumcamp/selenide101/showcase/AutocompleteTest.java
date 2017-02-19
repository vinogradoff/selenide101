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
    AutocompletePage autocompletePage = new AutocompletePage();
    autocompletePage.fill("V");
    autocompletePage.autocompleteBox.shouldHave(text("Virginia"))
            .shouldHave(text("Vermont"))
            .shouldNotHave(text("Alaska"));
    autocompletePage.selectFromAutocompleteBox("irginia");
    autocompletePage.stateInput.shouldHave(value("Virginia"));
  }

  @Test
  public void autocompleteCalifornia() {
    AutocompletePage autocompletePage = new AutocompletePage();
    autocompletePage.fill("Calif");
    autocompletePage.selectFromAutocompleteBox("Calif");
    autocompletePage.stateInput.shouldHave(value("California"));
  }
}
