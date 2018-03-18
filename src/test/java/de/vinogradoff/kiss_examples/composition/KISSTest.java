package de.vinogradoff.kiss_examples.composition;

import org.junit.Test;

import static com.codeborne.selenide.Condition.*;

public class KISSTest {

  @Test
  public void testDetails(){
    new KISSSavingAccountWidget().showDetails();
    new KISSSavingAccountWidget().accountNumber.shouldHave(text("12345"));
  }

  @Test
  public void testFooterAndHeader(){
    new KISSSavingAccountWidget().showDetails();
    new Header().logo.shouldBe(visible);
    new Footer().links.shouldHaveSize(5);
  }
}
