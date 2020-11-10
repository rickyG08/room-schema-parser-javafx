package edu.cnm.deepdive.controller;

import edu.cnm.deepdive.Parser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainController {

  @FXML
  private TextField sourceFile;

  @FXML
  private Button chooseSource;

  @FXML
  private TextField targetFile;

  @FXML
  private Button chooseTarget;

  @FXML
  private Button convert;

  @FXML
  private void chooseSource(ActionEvent actionEvent) {
    FileChooser fileChooser = new FileChooser();
    fileChooser.getExtensionFilters().add(new ExtensionFilter("JSON schema files", "*.json"));
    File selected = fileChooser.showOpenDialog(chooseSource.getScene().getWindow());
    if (selected != null) {
      sourceFile.setText(selected.getAbsolutePath());
    }
  }

  @FXML
  private void chooseTarget(ActionEvent actionEvent) {
    FileChooser fileChooser = new FileChooser();
    fileChooser.getExtensionFilters().add(new ExtensionFilter("Data definition language (DDL) file", "*.sql"));
    fileChooser.setInitialFileName("ddl.sql");
    File selected = fileChooser.showSaveDialog(chooseTarget.getScene().getWindow());
    if (selected != null) {
      targetFile.setText(selected.getAbsolutePath());
    }
  }

  @FXML
  private void convert(ActionEvent actionEvent){
    try (
        InputStream input = new FileInputStream(sourceFile.getText());
        PrintStream output = new PrintStream(targetFile.getText());
    ) {
      Parser parser = new Parser();
      String ddl = parser.extract(input);
      output.print(ddl);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
