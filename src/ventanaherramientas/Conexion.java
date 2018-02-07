
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaherramientas;

import java.sql.*;
import javax.swing.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Anthony
 */
public class Conexion {
    
    Connection conect = null;
    public Connection obtener()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión " + e);
        }
        return conect;
    }
}
