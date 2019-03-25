package de.vinogradoff.kiss_examples.composition;

import org.junit.*;

import static com.codeborne.selenide.Condition.*;

public class KISSTest {

  @BeforeClass
  public static void warning(){
    Assert.fail("These are just building block examples. Don't run them.\n" +
            "Этот код содержит только схематичные примеры. Не запускайте его");
  }

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
