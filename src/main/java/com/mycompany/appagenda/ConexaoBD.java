/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appagenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class ConexaoBD {
    
    private final String url = "jdbc:mysql://localhost:3306/agenda";
    private final String user = "root";
    private final String password = "";
    private Connection connection;
 
    public Connection connect() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Conexão bem-sucedida ao banco de dados!");
            }
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao conectar-se ao banco de dados: " + e.getMessage());
        }
        return connection;
    }
 
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexão com o banco de dados fechada com sucesso.");
            }
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao fechar a conexão com o banco de dados: " + e.getMessage());
        }
    }

 
}
