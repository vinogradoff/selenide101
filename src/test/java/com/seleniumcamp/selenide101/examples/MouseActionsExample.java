package com.seleniumcamp.selenide101.examples;

import org.junit.*;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class MouseActionsExample {

  @BeforeClass
  public static void openDemo() {
    open("smthing");
  }

  @Test
  public void basicActions() {
    $("").click();
    $("").contextClick(); //right click
    $("").doubleClick();
    $("").hover(); //mouse over
  }

  @Test
  public void dragAndDrop() {
    // Doesn't work with HTML5 draggable at this time (Selenium Bug)
    $("").dragAndDropTo($("element"));
  }

  @Test
  public void otherActions() {

    $("").scrollTo(); //scrolling to element

    //Selenide.actions() -> Selenium Actions
    actions().moveByOffset(10, 500)
            .clickAndHold()
            .moveByOffset(-10, -500)
            .release()
            .perform();

    //keyboard actions are also there
    actions().keyDown(Keys.ALT)
            .sendKeys("P")
            .keyUp(Keys.ALT);

  }

}
