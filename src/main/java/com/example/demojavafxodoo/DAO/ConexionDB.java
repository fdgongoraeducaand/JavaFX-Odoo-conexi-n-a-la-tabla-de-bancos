package com.example.demojavafxodoo.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// https://github.com/AmirUCR/jdbc_mechanic_shop/blob/master/src/Connection/ConnectionClass.java
public class ConexionDB {
    public static Connection connection = null;
    public static Connection getConnection() {

        //Parámetros de conexión
        String dbName = "Odoo";
        String dbPort = "5432";
        String username = "odoo";
        String password = "odoo";


        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:" + dbPort + "/" + dbName + "?user=" + username + "&password=" + password;
            // obtain a physical connection
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return connection;
    }


}
