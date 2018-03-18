package de.vinogradoff.inheritance;

import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class InheritedTest2 extends BaseTest{

  @Test
  public void testAnything(){
    $("#link").click();
    $("#image").shouldBe(visible);
  }
}
