package de.vinogradoff.kiss_examples.testdata;

import com.codeborne.selenide.*;
import org.junit.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class OtherTest {


  public static final String FIRSTNAME = "Alexei";
  public static final String LASTNAME = "Vinogradov";

  @Test
  public void testInput(){
    $("#firstname").setValue(FIRSTNAME);
    $("#lastname").setValue(LASTNAME);
    $("#submit").click();

    $("#fullname").shouldHave(exactText(FIRSTNAME+" "+LASTNAME));
  }

  @Test
  public void testSearchField(){
    $("#search").setValue(LASTNAME);
    $("#submit").click();

    $("#fullname").shouldHave(exactText(FIRSTNAME+" "+LASTNAME));
  }
}
