module com.example.simcity {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simcity to javafx.fxml;
    exports com.example.simcity;
}