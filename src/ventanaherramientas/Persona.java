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
public class Persona {
    String nombre_per;
    int ci_per;

    public Persona(String nombre_per, int ci_per) {
        this.nombre_per = nombre_per;
        this.ci_per = ci_per;
    }

    public String getNombre_per() {
        return nombre_per;
    }

    public void setNombre_per(String nombre_per) {
        this.nombre_per = nombre_per;
    }

    public int getCi_per() {
        return ci_per;
    }

    public void setCi_per(int ci_per) {
        this.ci_per = ci_per;
    }
    
}
