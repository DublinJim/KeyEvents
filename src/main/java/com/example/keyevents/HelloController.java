package com.example.keyevents;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HelloController {

    @FXML
    void closeApp(ActionEvent event) {
        Platform.exit ();
    }

}
