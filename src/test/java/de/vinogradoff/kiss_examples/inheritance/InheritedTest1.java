package de.vinogradoff.kiss_examples.inheritance;

import com.codeborne.selenide.*;
import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class InheritedTest1 extends BaseTest{

  @Test
  public void testSomething(){
    $("#button").click();
    $("#text").shouldBe(visible);
  }
}
