package dk.sea.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import org.mariuszgromada.math.mxparser.Expression;

public class MainController {
@FXML
private TextField resultText;

@FXML
private void addToFunction(ActionEvent actionEvent) {
  Button button = (Button) actionEvent.getSource();
  String text = resultText.getText() + button.getText();
  resultText.setText(text);
}

@FXML
private void evaluateFunction(ActionEvent actionEvent) {
  // After adding mXparser to your project dependencies (Maven/Gradle)
  Expression e = new Expression(resultText.getText());
  double result = e.calculate();
  resultText.setText(Double.toString(result));
}

@FXML
private void clearResult(ActionEvent actionEvent) {
  resultText.setText("");
}

@FXML
private void invertFunction(ActionEvent actionEvent) {
  String text = "-(" + resultText.getText() + ")";
  resultText.setText(text);
}
}