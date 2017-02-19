package com.seleniumcamp.selenide101.showcase;

import com.codeborne.selenide.*;
import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
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
    SelenideElement stateInput = $("md-autocomplete[placeholder*='US state'] input");
    SelenideElement autocompleteBox = $(".md-autocomplete-suggestions");

    stateInput.setValue("V");
    autocompleteBox.shouldHave(text("Virginia"))
            .shouldHave(text("Vermont"))
            .shouldNotHave(text("Alaska"));
    autocompleteBox.find(byText("irginia")).click();
    stateInput.shouldHave(attribute("value", "Virginia"));
  }
}
