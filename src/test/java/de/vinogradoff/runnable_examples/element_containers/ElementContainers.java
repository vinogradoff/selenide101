package de.vinogradoff.runnable_examples.element_containers;


import com.codeborne.selenide.SelenideElement;
import de.vinogradoff.runnable_examples.element_containers.widgetobjects.MovieBlock;
import de.vinogradoff.runnable_examples.element_containers.widgetobjects.MovieList;
import de.vinogradoff.runnable_examples.element_containers.widgetobjects.MovieTitle;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ElementContainers {

  @Test
  void areNotReallyNeeded(){
    open("https://www.rottentomatoes.com/browse/top-dvd-streaming/");
    $(".fontelloIcon.icon-list").click(); // list view
    SelenideElement list = new MovieList().list;
    new MovieTitle(new MovieBlock(list).firstBlock()).title().shouldHave(text("The Rhythm Section"));
    new MovieTitle(new MovieBlock(list).lastBlock()).title().shouldHave(text("Star Wars: The Rise Of Skywalker"));
  }

}
