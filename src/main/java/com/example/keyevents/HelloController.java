package com.example.keyevents;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class HelloController {
  @FXML private Text txt1;

  @FXML
  void closeApp() {
    Platform.exit();
  }

  @FXML
  void whatsTheKey(KeyEvent event) {
    if (event.getCode() == KeyCode.ENTER) {

      txt1.setText("You pressed Enter");
    }
    if (event.getCode() == KeyCode.SPACE) {

      txt1.setText("You pressed Spacebar");
    }
  }
}
