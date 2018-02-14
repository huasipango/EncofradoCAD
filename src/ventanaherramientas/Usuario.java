/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaherramientas;

public class Usuario extends Persona{
    private int codigo_usu;
    private String username_usu;
    private String contrasena_usu;

    public Usuario(String nombre_per, String ci_per, int codugo_usu, String username_usu, String contrasena_usu) {
        super(nombre_per, ci_per);
        this.codigo_usu = codugo_usu;
        this.username_usu = username_usu;
        this.contrasena_usu = contrasena_usu;
    }
    public int getCodugo_usu() {
        return codigo_usu;
    }

    public void setCodugo_usu(int codugo_usu) {
        this.codigo_usu = codugo_usu;
    }

    public String getUsername_usu() {
        return username_usu;
    }

    public void setUsername_usu(String username_usu) {
        this.username_usu = username_usu;
    }

    public String getContrasena_usu() {
        return contrasena_usu;
    }

    public void setContrasena_usu(String contrasena_usu) {
        this.contrasena_usu = contrasena_usu;
    }
    
    public void iniciarSecion(){
    }
    public void CerrarSecion(){
    }
    
    }
