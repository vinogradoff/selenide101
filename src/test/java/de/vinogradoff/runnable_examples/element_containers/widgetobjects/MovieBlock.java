package de.vinogradoff.runnable_examples.element_containers.widgetobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MovieBlock {

  SelenideElement root;

  public MovieBlock(SelenideElement root){
    this.root = root;
  }

  public SelenideElement firstBlock(){
    return root.$(".mb-movie");
  }

  public SelenideElement lastBlock(){
    return root.$$(".mb-movie").last();
  }
}
