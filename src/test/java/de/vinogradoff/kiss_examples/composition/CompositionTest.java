package de.vinogradoff.kiss_examples.composition;

import org.junit.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CompositionTest {

  @BeforeClass
  public static void warning(){
    Assert.fail("These are just building block examples. Don't run them.\n" +
            "Этот код содержит только схематичные примеры. Не запускайте его");
  }

  @Test
  public void testDetails(){
    new CompositionSavingAccountPage().showDetails();
    new CompositionSavingAccountPage().accountNumber.shouldHave(text("12345"));
  }

  @Test
  public void testFooterAndHeader(){
    CompositionSavingAccountPage savingAccountPage = new CompositionSavingAccountPage();
    savingAccountPage.showDetails();
    savingAccountPage.header.logo.shouldBe(visible);
    savingAccountPage.footer.links.shouldHaveSize(5);
  }
}
