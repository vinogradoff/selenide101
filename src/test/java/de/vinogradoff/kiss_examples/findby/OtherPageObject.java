package de.vinogradoff.kiss_examples.findby;

import com.codeborne.selenide.*;
import com.epam.jdi.uitests.web.selenium.elements.common.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import static com.codeborne.selenide.Condition.*;

public class OtherPageObject {

  public OtherPageObject(){
    PageFactory.initElements(WebDriverRunner.getWebDriver(), OtherPageObject.class);
  }

  @FindBy(css = "#text")
  SelenideElement description;
  @FindBy(css = "#button")
  WebElement submit;
  @FindBy(css = "#label")
  SelenideElement productName;
  @FindBy(css = "#link")
  WebElement followMe;
  @FindBy(css = "#textfield")
  SelenideElement passwordField;


  public void useElements(){
    description.getText();
    submit.click();
    productName.shouldBe(visible);
    followMe.click();
    passwordField.setValue("password");
  }
}
