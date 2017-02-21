package com.seleniumcamp.selenide101.examples;

import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class AssertionsAndCondtionsExample {

  @BeforeClass
  public static void openDemo() {
    open("/demo/input");
  }

  @Test
  public void simpleShoulds() {

    //every should* is an assert which
    // 1) waits its condition for at most Configuration.timeout ms
    // 2) if condition is not met after <timeout.ms>
    //    a) takes screenshot
    //    b) saves sourceCode
    //    c) outputs debug information about element and meaningful error message


    // all these should-s are the same, variants are for language semantics
    $("h1").shouldBe(visible);
    $("h1").shouldHave(text("Angular"));
    $("h1").should(appear);


    // negative variants of should-s
    $("h8").shouldBe(hidden);
    $("h1").shouldNotHave(text("Apple"));
    $("h8").shouldNot(exist);


  }


  @Test
  public void moreShoulds() {

    //chainable
    $("h1").shouldBe(visible)
            .shouldHave(text("Angular"))
            .should(appear);

    // >1 conditions
    $("h1").shouldHave(text("Angular"), cssClass("docs-logotype"));

    // is, be, not combined
    $("h1").should(be(visible), have(text("Angular")), not(be(hidden)));

    // or, and (why do you need them in tests?)
    $("h1").shouldBe(or("to be or not to be visible", visible, hidden));
    $("h1").shouldBe(and("fish & chops", visible, not(disabled)));
  }

  @Test
  public void visibilityConditions() {
    //Conditions.*

    // the most popular!
    $("h1").shouldBe(visible); //and shouldNotBe(visible) too
    $("h1").should(appear); //it is the same

    // exists in DOM could be visible or hidden
    // why do you need it in UI tests?
    $("h1").should(exist);

    // hidden or does not exist!!
    $("h8").shouldBe(hidden);
    $("h8").should(disappear); //the same
  }

  @Test
  public void textConditions() {

    $("h1").shouldHave(text("ANGULA")); //case insensitive, partial match
    $("h1").shouldHave(textCaseSensitive("Angular")); //case sensitive, partial match
    $("h1").shouldHave(exactText("ANGULAR Material")); //case insensitive, exact match
    $("h1").shouldHave(exactTextCaseSensitive("Angular Material")); //case sensitive, exact match
    $("h1").should(matchText("[A..Z]ngular")); //regexp
  }

  @Test
  public void otherConditions() {

    //popular
    $("body").shouldHave(attribute("layout", "row")); //with value
    $("h1").shouldNotHave(attribute("href")); //any value
    $("h1").shouldHave(cssClass("docs-logotype"));

    // for inputs
    $("input[ng-model='user.company']").shouldBe(disabled);
    $("input[ng-model='user.firstName']").shouldBe(enabled);
    $("input[ng-model='user.firstName']").shouldBe(empty);

    $("input[ng-model='user.company']").shouldHave(value("Goo")); //partial match
    $("input[ng-model='user.company']").shouldHave(exactValue("Google"));

    //others
    $("[type=button]").shouldHave(type("button"));
    $("[type=button]").shouldNotHave(id("123"));
    $("[name=documentation-version]").shouldHave(name("documentation-version"));

  }
}
