package de.vinogradoff.kiss_examples.testdata;

import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class KISSTest {
  @BeforeClass
  public static void warning(){
    Assert.fail("These are just building block examples. Don't run them.\n" +
            "Этот код содержит только схематичные примеры. Не запускайте его");
  }

  @Test
  public void testInput(){
    $("#firstname").setValue("Alexei");
    $("#lastname").setValue("Vinogradov");
    $("#submit").click();

    $("#fullname").shouldHave(exactText("Alexei Vinogradov"));
  }

  @Test
  public void testSearchField(){
    $("#search").setValue("Vinogradov");
    $("#submit").click();

    $("#fullname").shouldHave(exactText("Alexei Vinogradov"));
  }
}
