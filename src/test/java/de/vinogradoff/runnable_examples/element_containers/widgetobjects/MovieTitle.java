package de.vinogradoff.runnable_examples.element_containers.widgetobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MovieTitle {

  public MovieTitle(SelenideElement root){
    this.root=root;
  }
  SelenideElement root;

  public SelenideElement title(){
    return root.$("h3.movieTitle");
  }
}
