package dk.sea.calculator;

import javafx.application.Application;

import org.mariuszgromada.math.mxparser.License;

public class Launcher {
public static void main(String[] args) {
  License.iConfirmNonCommercialUse("emilkc-code");
  Application.launch(App.class, args);
}
}
