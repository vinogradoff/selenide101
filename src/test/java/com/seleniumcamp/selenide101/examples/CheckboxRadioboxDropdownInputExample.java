package com.seleniumcamp.selenide101.examples;

import com.codeborne.selenide.*;
import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class CheckboxRadioboxDropdownInputExample {


  @Test
  public void checkbox() {
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

  @Test
  public void radiobox() {
    open("http://www.ebay.com/sch/ebayadvsearch");

    //only standard HTML radioboxes
    $("[name=_fsradio2]").selectRadio("&LH_LocatedIn=1"); //value of radiobox item

    // we should definitely add element.getSelectedRadio one day :)
    getSelectedRadio(byName("_fsradio2")).shouldHave(value("LocatedIn"));

  }

  @Test
  public void dropdown() {
    open("https://the-internet.herokuapp.com/dropdown");

    //only standard HTML selects
    $("#dropdown").getSelectedOption().shouldBe(disabled);

    $("#dropdown").selectOption("Option 2"); //exact text match
    $("#dropdown").selectOptionContainingText("ption 1"); //partial match
    $("#dropdown").selectOption(2); //starting from 0, third option
    $("#dropdown").selectOptionByValue("1"); //value

    $("#dropdown").getSelectedOption().shouldHave(text("Option 1"), value("1"));

  }

  @Test
  public void input() {
    open("https://the-internet.herokuapp.com/login");
    //fill in with JavaScript
    Configuration.fastSetValue = true;
    $("#username").setValue("abc");
    $("#username").shouldHave(value("abc"));

    //default. Traditional sendKeys of Selenium
    Configuration.fastSetValue = false;
    $("#username").shouldHave(value("abc"));
    $("#username").setValue("abc");


  }
}

