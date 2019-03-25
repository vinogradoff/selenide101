package de.vinogradoff.kiss_examples.inheritance;

import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class InheritedTest2 extends BaseTest{

  @BeforeClass
  public static void warning(){
    Assert.fail("These are just building block examples. Don't run them.\n" +
            "Этот код содержит только схематичные примеры. Не запускайте его");
  }

  @Test
  public void testAnything(){
    $("#link").click();
    $("#image").shouldBe(visible);
  }
}
