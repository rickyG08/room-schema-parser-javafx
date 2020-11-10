package edu.cnm.deepdive;

import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainJfx extends Application {

  private static final String RESOURCE_BUNDLE = "strings";
  private static final String LAYOUT_RESOURCE = "main.fxml";
  private static final String WINDOW_TITLE_KEY = "window_title";

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    ResourceBundle bundle = ResourceBundle.getBundle(RESOURCE_BUNDLE);
    FXMLLoader fxmlLoader =
        new FXMLLoader(MainJfx.class.getClassLoader().getResource(LAYOUT_RESOURCE), bundle);
    Parent root = fxmlLoader.load();
    Scene scene = new Scene(root);
    stage.setTitle(bundle.getString(WINDOW_TITLE_KEY));
    stage.setResizable(false);
    stage.setScene(scene);
    stage.sizeToScene();
    stage.show();
  }

}