/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author david Franco
 */
public class Conexion {

    ResultSet r = null;
    Statement s = null;

    public static Connection conectar() throws SQLException {

        Connection conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/abarrotes_la_maestra";
            String usuario = "root";
            String password = "";

            conexion = (Connection) DriverManager.getConnection(servidor, usuario, password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error de conexion" + ex);
            conexion = null;
        }

        return conexion;

    }

    public ResultSet resultado(String query) {
        try {
            s = Conexion.conectar().createStatement();
            r = s.executeQuery(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);
        }
        return r;
    }

    public void cerrar() {
        try {
            r.close();
        } catch (SQLException e) {

        }
    }

}
