module com.example.demojavafxodoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.demojavafxodoo to javafx.fxml;
    exports com.example.demojavafxodoo;
    exports com.example.demojavafxodoo.Controladores;
    exports com.example.demojavafxodoo.DAO;
    opens com.example.demojavafxodoo.Controladores to javafx.fxml;
    opens com.example.demojavafxodoo.modelos to javafx.base;
    opens com.example.demojavafxodoo.DAO to javafx.fxml;


}