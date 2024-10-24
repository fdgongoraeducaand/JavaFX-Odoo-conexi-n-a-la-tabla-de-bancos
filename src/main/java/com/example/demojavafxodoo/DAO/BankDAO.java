package com.example.demojavafxodoo.DAO;

import com.example.demojavafxodoo.modelos.Bank;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class BankDAO {
    public static List<Bank> obtenerBancos() throws SQLException {
        List<Bank> bancos = new ArrayList<>();

        try (Connection conexion = ConexionDB.getConnection();
             Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM res_bank ORDER BY name ")) {

            while (resultSet.next()) {
                Bank banco = new Bank();
                banco.setName(resultSet.getString("name"));
                banco.setCity(resultSet.getString("city"));
                bancos.add(banco);
                System.out.println(resultSet.getString("name"));
            }
        }

        return bancos;
    }


    public static List<Bank> buscarBancosNombre(String nombre) throws SQLException {
        List<Bank> bancos = new ArrayList<>();
        String sentencia = "SELECT name "+
                           "FROM res_bank "+
                           "WHERE name LIKE  '%" + nombre + "'";

        try (Connection conexion = ConexionDB.getConnection();
             Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sentencia)) {

            while (resultSet.next()) {
                Bank banco = new Bank();
                banco.setName(resultSet.getString("name"));
                bancos.add(banco);
                System.out.println(resultSet.getString("name"));
            }
        }

        return bancos;
    }

    public static List<Bank> buscarBancosNombreBien(String nombre) throws SQLException {
        List<Bank> bancos = new ArrayList<>();

        try (Connection conexion = ConexionDB.getConnection();
             PreparedStatement sentencia = conexion.prepareStatement("SELECT name FROM res_bank WHERE name  LIKE ?");
             ) {

            sentencia.setString(1, "%"+nombre+"%");
            ResultSet resultSet = sentencia.executeQuery();;

            while (resultSet.next()) {
                Bank banco = new Bank();
                banco.setName(resultSet.getString("name"));
                bancos.add(banco);
                System.out.println(resultSet.getString("name"));
            }
        }

        return bancos;
    }
}
