package dk.sea.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
@Override
public void start(Stage stage) throws IOException {
  FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MainView.fxml"));
  Scene scene = new Scene(fxmlLoader.load(), 470, 520);
  stage.setTitle("Calculator");
  stage.setScene(scene);
  stage.show();
}
}
