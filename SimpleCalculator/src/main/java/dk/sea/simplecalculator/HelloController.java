package dk.sea.simplecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
@FXML
private TextField textNumber1;

@FXML
private Label labelOperator;

@FXML
private TextField textNumber2;

@FXML
private Button buttonPlus;

@FXML
private Button buttonMinus;

@FXML
private Button buttonMultiply;

@FXML
private Button buttonDivide;

@FXML
private Button buttonCalculate;

@FXML
private Label labelResult;

@FXML
private void onButtonChangeOperator(ActionEvent actionEvent) {
  Button button = (Button) actionEvent.getSource();
  String text = switch (button.getText()) {
    case ":)" -> ":)";
    case ":(" -> ":(";
    case ":D" -> ":D";
    case "D:" -> "D:";
    default -> "";
  };
  labelOperator.setText(text);
}

@FXML
private void onButtonCalculateClick(ActionEvent actionEvent) {
  double x = Double.parseDouble(textNumber1.getText());
  double y = Double.parseDouble(textNumber2.getText());
  double result = switch (labelOperator.getText()) {
    case ":)" -> x + y;
    case ":(" -> x - y;
    case ":D" -> x * y;
    case "D:" -> x / y;
    default -> 0;
  };
  labelResult.setText(Double.toString(result));
}
}