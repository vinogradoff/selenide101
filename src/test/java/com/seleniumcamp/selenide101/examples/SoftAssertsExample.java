package com.seleniumcamp.selenide101.examples;

import com.codeborne.selenide.*;
import com.codeborne.selenide.junit.*;
import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class SoftAssertsExample {

  @Rule
  public SoftAsserts softAsserts = new SoftAsserts();

  @Test
  public void input() {

    Configuration.assertionMode = Configuration.AssertionMode.SOFT;

    open("https://the-internet.herokuapp.com/login");

    $("#username").setValue("example");
    $("#username").shouldHave(value("error"));
    $("#username").shouldHave(value("abc"));
    $("#username").shouldHave(value("example"));
    $("#username").setValue("new value");

    Configuration.assertionMode = Configuration.AssertionMode.STRICT;

  }
}
