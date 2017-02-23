package com.seleniumcamp.selenide101.examples;

import com.codeborne.selenide.*;
import org.junit.*;

import java.io.*;

import static com.codeborne.selenide.Selenide.*;

/**
 * @author Alexei Vinogradov
 */
public class FileOperationsExample {


  @Test
  public void downloadFile() throws FileNotFoundException {

    open("http://the-internet.herokuapp.com/download");

    //FileNotFoundException is thrown if server returns 40x on download
    // works for remote WebDriver as well!
    File file = $(Selectors.byText("some-file.txt")).download();

  }

  @Test
  public void uploadFile() {
    open("http://the-internet.herokuapp.com/upload");

    // works for remote driver as well!
    File file = new File("src/test/resources/readme.txt");
    $("#file-upload").uploadFile(file);

    // classpath - typically resources folder in maven/gradle source structure
    $("#file-upload").uploadFromClasspath("readme.txt");

    // don't forget to submit ;-)
    $("#file-submit").click();

  }
}
