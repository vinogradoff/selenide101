package de.vinogradoff.kiss_examples.inheritance;

import com.codeborne.selenide.*;
import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class InheritedTest1 extends BaseTest{

  @BeforeClass
  public static void warning(){
    Assert.fail("These are just building block examples. Don't run them.\n" +
            "Этот код содержит только схематичные примеры. Не запускайте его");
  }
  @Test
  public void testSomething(){
    $("#button").click();
    $("#text").shouldBe(visible);
  }
}
