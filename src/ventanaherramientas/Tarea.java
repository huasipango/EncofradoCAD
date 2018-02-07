/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaherramientas;

import java.sql.*;
/**
 *
 * @author Anthony
 */
public class Tarea {
    
    
        
    public int getTotal(Connection conexion, String herramienta) throws SQLException
    {
        int total = 0;
        PreparedStatement consulta = conexion.prepareStatement("SELECT total_her FROM t_herramienta WHERE nombre_her = '"+herramienta+"'");
        ResultSet resultado = consulta.executeQuery();
        while(resultado.next())
        {           
            total=resultado.getInt("total_her");
        }
        return total;
    }        
    
}
