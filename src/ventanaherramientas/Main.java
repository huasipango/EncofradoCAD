/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaherramientas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Angeloni
 */
public class Main {
    
    static Conexion conx = new Conexion();//HACIENDO LA CONEXIÓN
    static Connection conn = conx.obtener();
    
        public static void main(String args[]) {
            int clave=cargar();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    if(clave!=12345){
                    new frmactivacion().setVisible(true);
                    }
                    if(clave==12345){
                    WinLogin winlogin1 = new WinLogin();
                    winlogin1.setVisible(true);
                    }
                }
            });

    }
        public static int cargar()
        {
            int key=0;
            String sql = "SELECT codigo_lic FROM t_licencia";
            String datos[]= new String[5];
            Statement stm;
            try {
                stm=conn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                System.out.println("1");
                while(rs.next()){
                key=rs.getInt(1);
                }
                System.out.println(key);
            } catch (Exception e) {
                key=0;
                System.out.println(e);
            }
            return key;
        }
}
