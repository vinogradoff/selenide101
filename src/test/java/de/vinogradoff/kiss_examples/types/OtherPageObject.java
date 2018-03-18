package de.vinogradoff.kiss_examples.types;

import com.epam.jdi.uitests.web.selenium.elements.common.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;

public class OtherPageObject {

  Text description=new Text(By.cssSelector("#text"));
  Button submit=new Button(By.cssSelector("#button"));
  Label productName=new Label(By.cssSelector("#label"));
  Link followMe=new Link(By.cssSelector("#link"));
  TextField passwordField=new TextField(By.cssSelector("#textfield"));


  public void useElements(){
    description.getText();
    submit.click();
    productName.shouldBe(visible);
    followMe.click();
    passwordField.setValue("password");
  }
}
