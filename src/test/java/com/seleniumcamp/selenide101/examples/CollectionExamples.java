package com.seleniumcamp.selenide101.examples;

import com.codeborne.selenide.*;
import org.junit.*;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class CollectionExamples {

  // Collections could be slow!!
  // Don't use them if collections must process too many elements

  @BeforeClass
  public static void openDemo() {
    open("smthing");
  }


  @Test
  public void basicSelectors() {

    //Collections are Iterable SelenideElements
    ElementsCollection collection = $$("div");

    $$("abc"); // doesn't search anything!

    // use the same Selectors as in $
    $$(byText("abc"));

  }

  @Test
  public void operationsOnCollections() {
    //filtering
    $$("div").filterBy(text("123")); //only with text 123
    $$("div").excludeWith(text("123")); // all except with text 123
    //choosing an element
    $$("div").first();
    $$("div").last();
    $$("div").get(2); // get third element, index from 0

    // find first match (works faster now)
    $$("div").findBy(text("123")); // finds the first element

  }

  @Test
  public void operationsReturns() {
    ElementsCollection collection = $$("div").filterBy(text("123")); // even when filters to a single element!
    ElementsCollection collection2 = $$("div").filterBy(text("xyz")); // empty collection!
    SelenideElement element = $$("div").get(2);
    SelenideElement element2 = $$("div").find(text("xyz")); // null?
  }

  @Test
  public void assertions() {
    //CollectionCondition.*

    //Size assertion
    $$("div").shouldBe(CollectionCondition.empty);
    $$("div").shouldHave(size(5));
    $$("div").shouldHaveSize(5); //the same

    $$("div").shouldHave(sizeGreaterThan(1));
    $$("div").shouldHave(sizeGreaterThanOrEqual(1));
    $$("div").shouldHave(sizeLessThan(100));
    $$("div").shouldHave(sizeLessThanOrEqual(100));
    $$("div").shouldHave(sizeNotEqual(1984));


    // text assertions are case-sensitive
    $$("div").shouldHave(texts("", "")); //partial matches of every single text
    $$("div").shouldHave(exactTexts("", ""));

    // as of Selenide 4.3
    // no methods for asserting collection has some of elements
    // or for asserting ignoring the order of elements
    // Alternative solution: iterating over collection
    // (it is on the to be done features list)

  }
}
