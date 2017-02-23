package com.seleniumcamp.selenide101.examples;

import org.junit.*;

import java.util.*;

import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class JavaScriptExample {

  @BeforeClass
  public static void openDemo() {
    open("smthing");
  }

  @Test
  public void javascriptUsage() {

    //Selenide.*

    // without arguments and return
    executeJavaScript("alert('hello world')");
    //with arguments
    executeJavaScript("alert('hello world')", "abc", 12);
    //with return value
    String response = executeJavaScript("alert('hello world')", "abc", 12);

    // Errors asserting
    executeJavaScript("function");
    List<String> jsErrors = getJavascriptErrors();
    System.out.println(jsErrors);

    // assert no errors
    assertNoJavascriptErrors();

  }
}
