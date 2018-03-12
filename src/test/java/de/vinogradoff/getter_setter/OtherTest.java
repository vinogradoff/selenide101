package de.vinogradoff.getter_setter;

import com.codeborne.selenide.*;
import org.junit.Test;

import static com.codeborne.selenide.Condition.visible;

public class OtherTest {

  @Test
  public void testProductName(){
    new OtherPageObject().getProductName().shouldBe(visible);
  }
}
