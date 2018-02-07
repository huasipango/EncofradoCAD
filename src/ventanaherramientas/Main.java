/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaherramientas;

/**
 *
 * @author Angeloni
 */
public class Main {
        public static void main(String args[]) {
            String clave="T";
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    if(clave==null){
                    new frmactivacion().setVisible(true);
                    }
                    if(clave!=null){
                    WinLogin winlogin1 = new WinLogin();
                    winlogin1.setVisible(true);
                    }
                }
            });

    }
}
