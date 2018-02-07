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
public class Herramienta {
    private int codigo_her;
    private String nombre;
    private int disponibilidad_her;
    private int total_her;
    private float precio_her;

    public Herramienta(int codigo_her, String nombre, int disponibilidad_her, int total_her, float precio_her) {
        this.codigo_her = codigo_her;
        this.nombre = nombre;
        this.disponibilidad_her = disponibilidad_her;
        this.total_her = total_her;
        this.precio_her = precio_her;
    }

    public int getCodigo_her() {
        return codigo_her;
    }

    public void setCodigo_her(int codigo_her) {
        this.codigo_her = codigo_her;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDisponibilidad_her() {
        return disponibilidad_her;
    }

    public void setDisponibilidad_her(int disponibilidad_her) {
        this.disponibilidad_her = disponibilidad_her;
    }

    public int getTotal_her() {
        return total_her;
    }

    public void setTotal_her(int total_her) {
        this.total_her = total_her;
    }

    public float getPrecio_her() {
        return precio_her;
    }

    public void setPrecio_her(float precio_her) {
        this.precio_her = precio_her;
    }
    public void agregarStock(){
        
    }
   
}
