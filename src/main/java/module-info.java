module com.example.keyevents {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.keyevents to javafx.fxml;
    exports com.example.keyevents;
}