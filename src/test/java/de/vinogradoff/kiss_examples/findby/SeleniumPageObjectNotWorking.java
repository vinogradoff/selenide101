package de.vinogradoff.kiss_examples.findby;

import com.codeborne.selenide.*;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


// will not work, because Selenium doesn't use Lazy WebElement evaluation
public class SeleniumPageObjectNotWorking {

  WebDriver driver=WebDriverRunner.getWebDriver();

  // search will start immediately during class/object initialization
  WebElement description=driver.findElement(By.cssSelector("#text")),
             submitBtn=driver.findElement(By.cssSelector("#button")),
             productName=driver.findElement(By.cssSelector("#label")),
             followMe=driver.findElement(By.cssSelector("#link")),
             passwordField=driver.findElement(By.cssSelector("#textfield"));

  public void useElements(){
    description.getText();
    submitBtn.click();
    productName.getText();
    followMe.click();
    passwordField.sendKeys("password");
  }
}
