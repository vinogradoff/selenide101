package com.seleniumcamp.selenide101.showcase;

import com.codeborne.selenide.*;
import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.System.*;

/**
 * @author Alexei Vinogradov
 */
public class AutocompleteTest {

  @BeforeClass
  public static void setup() {
    Configuration.timeout = 5000;
    Configuration.browser = "chrome";
    setProperty("webdriver.chrome.driver", "/Users/Shared/selenium/chromedriver-2.27");
    Configuration.startMaximized = false;
  }

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
