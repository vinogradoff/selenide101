package com.seleniumcamp.selenide101.examples;

import com.codeborne.selenide.junit.*;
import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class ProfilingExample {

  //just run it and look in console logs
  @Rule
  public TextReport report = new TextReport();

  @Test
  public void checkboxTest() {
    open("https://the-internet.herokuapp.com/checkboxes");

    //only standard HTML checkboxes
    $("input[type=checkbox]").click();
    $("input[type=checkbox]").shouldBe(checked);

    //or
    $("input[type=checkbox]").setSelected(true);
    $("input[type=checkbox]").shouldBe(checked);


    $("input[type=checkbox]", 1).setSelected(false);
    $("input[type=checkbox]", 1).shouldNotBe(checked);

  }
}
