/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaherramientas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Anthony
 */
public class Funciones {
    public void Sletras (JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if (Character.isDigit(c)) {
                    e.consume();
                    limite(a);
                }
            }
        }
        );
    }
        public void Snumeros (JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();                  
                }
               if (a.getText().length()>9) {
                    e.consume();                  
                }
            }
        }
        );
    }
     public void limite (JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                if (a.getText().length()>20) {
                    e.consume();                  
                }
            }
        }
        );
    }
}
