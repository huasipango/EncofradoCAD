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
public class Cliente extends Persona{
    
    private int codigo_cli;

    public int getCodigo_cli() {
        return codigo_cli;
    }

    public void setCodigo_cli(int codigo_cli) {
        this.codigo_cli = codigo_cli;
    }

    public Cliente(int codigo_cli, String nombre_per, String ci_per) {
        super(nombre_per, ci_per);
        this.codigo_cli = codigo_cli;
    }
    
}
