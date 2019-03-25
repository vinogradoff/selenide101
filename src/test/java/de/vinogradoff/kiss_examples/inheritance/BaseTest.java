package de.vinogradoff.kiss_examples.inheritance;

import de.vinogradoff.kiss_examples.fluent.OtherSearchPage;
import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

  @BeforeClass
  public static void warning(){
    Assert.fail("These are just building block examples. Don't run them.\n" +
            "Этот код содержит только схематичные примеры. Не запускайте его");
  }

  @Before
  public void openSite() {
      open("http://example.com");
      // login(username,password);
  }
}
