package com.seleniumcamp.selenide101.examples;

import org.junit.*;

import java.io.*;

import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class FileOperationsExample {

  @BeforeClass
  public static void openDemo() {
    open("smthing");
  }

  @Test
  public void downloadFile() throws FileNotFoundException {

    //FileNotFoundException could be thrown
    // works for remote WebDriver as well!
    File file = $("file").download();

  }

  @Test
  public void uploadFile() {

    // works for remote driver as well
    File file = new File("readme.txt");
    $("file").uploadFile(file);
    $("file").uploadFromClasspath("readme.txt");

  }
}
