module dk.sea.simplecalculator {
  requires javafx.controls;
  requires javafx.fxml;


  opens dk.sea.simplecalculator to javafx.fxml;
  exports dk.sea.simplecalculator;
}