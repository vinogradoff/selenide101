package com.seleniumcamp.selenide101.examples;

import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class WaitsExample {

  @BeforeClass
  public static void openDemo() {
    open("/demo/button");
  }

  @Test
  public void waiting() {
    // if you want wait, but really wait
    $("").waitUntil(visible, 30000); //waits 30 seconds
    $("").waitUntil(text("Ready"), 15000);

    // wait while condition is met
    $("").waitWhile(hidden, 15000);

  }

  @Test(expected = AssertionError.class)
  public void timeout() {
    // if fails then
    // the same in should (Screenshots, Readable Message, SourceCode)
    $("abc").waitUntil(visible, 10000); //waits 10 seconds, then AssertionError
  }
}
