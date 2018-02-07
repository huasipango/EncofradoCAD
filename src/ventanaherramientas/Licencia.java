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
public class Licencia {
    private String codigo_lic;

    public Licencia(String codigo_lic) {
        this.codigo_lic = codigo_lic;
    }

    public String getCodigo_lic() {
        return codigo_lic;
    }

    public void setCodigo_lic(String codigo_lic) {
        this.codigo_lic = codigo_lic;
    }
    public boolean  activarProducto(String clave){
        boolean activado=false;
        if(clave.equals("JAD-ESPE-123")){
            activado=true;
        }
        return(activado);
    }

}

