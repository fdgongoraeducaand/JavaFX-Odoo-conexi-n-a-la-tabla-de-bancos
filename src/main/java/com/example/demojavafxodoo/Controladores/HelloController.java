package com.example.demojavafxodoo.Controladores;

import com.example.demojavafxodoo.modelos.Bank;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import com.example.demojavafxodoo.DAO.BankDAO;

import java.sql.SQLException;
import java.util.List;

public class HelloController {


    @FXML
    private TableColumn tcName;
    @FXML
    private TableView tbDatos;

    public void initialize() throws SQLException {

        tcName.setCellValueFactory(new PropertyValueFactory<>("name"));

        try {
            List<Bank> bancos = BankDAO.obtenerBancos();
            ObservableList<Bank> datos = FXCollections.observableArrayList(bancos);
            tbDatos.setItems(datos);
        } catch (SQLException e) {
            System.err.println("Error al obtener los bancos: " + e.getMessage());
            // Manejar la excepción adecuadamente, por ejemplo, mostrando un mensaje de error al usuario
        }
    }
}