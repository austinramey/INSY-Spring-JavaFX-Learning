module com.example.insyspringjavafxlearning {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.insyspringjavafxlearning to javafx.fxml;
    exports com.example.insyspringjavafxlearning;
}