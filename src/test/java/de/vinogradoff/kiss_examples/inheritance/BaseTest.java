package de.vinogradoff.kiss_examples.inheritance;

import de.vinogradoff.kiss_examples.fluent.OtherSearchPage;
import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

  @Before
  public void openSite() {
      open("http://example.com");
      // login(username,password);
  }
}
