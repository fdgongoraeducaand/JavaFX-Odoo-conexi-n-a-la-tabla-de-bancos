module com.example.demojavafxodoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demojavafxodoo to javafx.fxml;
    exports com.example.demojavafxodoo;
}