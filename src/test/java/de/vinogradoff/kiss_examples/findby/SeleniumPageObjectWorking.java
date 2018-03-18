package de.vinogradoff.kiss_examples.findby;

import com.codeborne.selenide.*;
import org.openqa.selenium.*;


// will  work
public class SeleniumPageObjectWorking {

  WebDriver driver=WebDriverRunner.getWebDriver();

  By description=By.cssSelector("#text"),
             submitBtn=By.cssSelector("#button"),
             productName=By.cssSelector("#label"),
             followMe=By.cssSelector("#link"),
             passwordField=By.cssSelector("#textfield");

  public void useElements(){
    driver.findElement(description).getText();
    driver.findElement(submitBtn).click();
    driver.findElement(productName).getText();
    driver.findElement(followMe).click();
    driver.findElement(passwordField).sendKeys("password");
  }
}
