package com.seleniumcamp.selenide101.examples;

import com.codeborne.selenide.*;
import com.codeborne.selenide.ex.*;
import org.junit.*;

import java.util.*;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.*;

/**
 * @author Alexei Vinogradov
 */
public class JavaScriptExample {

  @Test
  public void javascriptUsage() {

    open("https://the-internet.herokuapp.com/javascript_error");
    //Selenide.*

    // without arguments
    executeJavaScript("alert('selenide')");
    Selenide.confirm(); //close alert dialog
    //with arguments
    executeJavaScript("alert(arguments[0]+arguments[1])", "abc", 12);
    Selenide.confirm();
    //with return value
    long fortytwo = executeJavaScript("return arguments[0]*arguments[1];", 6, 7);
    assertEquals(42, fortytwo);

  }

}
