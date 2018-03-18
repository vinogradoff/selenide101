package de.vinogradoff.inheritance;

import de.vinogradoff.fluent.OtherSearchPage;
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
