module dk.sea.calculator {
  requires javafx.controls;
  requires javafx.fxml;
  requires MathParser.org.mXparser;


  opens dk.sea.calculator to javafx.fxml;
  exports dk.sea.calculator;
}