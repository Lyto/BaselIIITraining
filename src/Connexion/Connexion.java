/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

import java.sql.*;

/**
 *
 * @author Laura
 */
public class Connexion {

    private Connection conn;
    private Statement stmt;
    private ResultSet res;

    public Connexion(String database, String login, String password) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String urlDatabase = "jdbc:mysql://localhost:3306/";

        conn = DriverManager.getConnection(urlDatabase + database, login, password);
        stmt = conn.createStatement();

        System.out.println("Connexion à la base de données: OK");

    }

    public boolean authentification(String login, String password) throws SQLException {

        String sql = "SELECT * FROM users WHERE login = '" + login + "' AND password = '" + password + "' ";
        res = stmt.executeQuery(sql);

        if (res.next()) {
            return true;
        } else {
            return false;
        }

    }
}
