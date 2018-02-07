/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaherramientas;

import java.util.Date;

/**
 *
 * @author Angeloni
 */
public class Proyecto {
    private int codigo_pro;
    private String  nombre_pro;
    private Date fecha_creacion;
    private float precio_pro;
    private float area;

    

    public Proyecto(int codigo_pro, String nombre_pro, Date fecha_creacion, float precio_pro, float area) {
        this.codigo_pro = codigo_pro;
        this.nombre_pro = nombre_pro;
        this.fecha_creacion = fecha_creacion;
        this.precio_pro = precio_pro;
        this.area = area;
    }

    public int getCodigo_pro() {
        return codigo_pro;
    }

    public void setCodigo_pro(int codigo_pro) {
        this.codigo_pro = codigo_pro;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public float getPrecio_pro() {
        return precio_pro;
    }

    public void setPrecio_pro(float precio_pro) {
        this.precio_pro = precio_pro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    public void consultarProyecto(){
    }
    public void atualizarProyecto(){
    
    }
    public float consultarPrecio(){
        
        return(getPrecio_pro());
    }
    
}
