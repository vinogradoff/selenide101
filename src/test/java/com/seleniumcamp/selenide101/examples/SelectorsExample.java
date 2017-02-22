package com.seleniumcamp.selenide101.examples;

import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class SelectorsExample {

  @BeforeClass
  public static void openDemo() {
    open("/demo/button");
  }

  @Test
  public void seleniumSelectors() {

    $("xyz");  // no error it doesn't search for anything!

    //Selectors.by**

    // Simple Selectors (from Selenium)
    $("md-content .md-ink-ripple").click(); //=byCss
    $(byXpath("//button")).shouldBe(visible);
    $(byId("abc"));
    $(byLinkText("Button"));
    $(byPartialLinkText("utton"));
    $(byName("name"));
    $(byClassName("md-ink-ripple"));
    //$(byTagName() -> is not available, use $("tagname");

  }

  @Test
  public void selenideSelectors() {

    //Added Selectors from Selenide
    $(byText("Basic Usage")).click();  // EXACT Texts
    $(withText("asic Usage")).click(); //finds partial occurance
    $(byAttribute("md-svg-src", "img/icons/android.svg")).click();
    $(by("md-svg-src", "img/icons/android.svg")).click(); //the same as above
    $("div", 2); // index starts with 0, the third <div> will be selected
    $(byTitle("my_title"));
    $(byValue("my_value"));
  }


  @Test
  public void redundantSelectors() {

    // This selectors can all be replaced with $("")
    // no errors, $ doesn't search for anything
    $(byName("abc"));
    $("[name=abc]"); // is the same
    $(byTitle("cde"));
    $("[title=cde]"); // is the same
    $(byValue("fgh"));
    $("[value=fgh]"); // is the same
    $(byId("ijk"));
    $("#ijk"); // is the same
    $(byClassName("xyz"));
    $(".xyz"); // is the same
  }


  @Test
  public void chainedSelectors() {

    // Selectors can be naturally chained
    $("div.container").$("button.buy"); // still doesn't search!
    // find is synonym for $
    $(".container").find(".subarea").find(byText("abc")); //and it still doesn't search, despite of its name.

    // parent and closest(tag) helps navigation in DOM
    $(byText("Bottom Sheet")).parent().closest("ul").shouldBe(visible);

  }
}
