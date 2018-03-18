package de.vinogradoff.kiss_examples.inheritance;

import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class KISSTest1{

  @Before
  public void openSite() {
    open("http://example.com");
    // login(username,password);
  }

  @Test
  public void testSomething(){
    $("#button").click();
    $("#text").shouldBe(visible);
  }
}
