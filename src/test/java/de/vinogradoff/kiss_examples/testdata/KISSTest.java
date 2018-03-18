package de.vinogradoff.kiss_examples.testdata;

import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class KISSTest {

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
