module com.example.patrones_comportamentales {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.patrones_comportamentales to javafx.fxml;
    exports com.example.patrones_comportamentales;
}