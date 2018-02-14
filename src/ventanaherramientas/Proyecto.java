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
    private java.sql.Date fecha_creacion;
    private java.sql.Date fecha_limite;
    private float precio_pro;
    private float area;
    private Usuario usuario_pro;
    private Cliente cliente_pro;

    

    public Proyecto(int codigo_pro, String nombre_pro, java.sql.Date fecha_creacion, java.sql.Date fecha_limite, float precio_pro, float area, Cliente cliente_pro, Usuario usuario_pro) {
        this.codigo_pro = codigo_pro;
        this.nombre_pro = nombre_pro;
        this.fecha_creacion = fecha_creacion;
        this.fecha_limite=fecha_limite;
        this.precio_pro = precio_pro;
        this.area = area;
        this.cliente_pro=cliente_pro;
        this.usuario_pro=usuario_pro;
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

    public java.sql.Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(java.sql.Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public java.sql.Date getFecha_limite() {
        return fecha_limite;
    }

    public void setFecha_limite(java.sql.Date fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public Usuario getUsuario_pro() {
        return usuario_pro;
    }

    public void setUsuario_pro(Usuario usuario_pro) {
        this.usuario_pro = usuario_pro;
    }

    public Cliente getCliente_pro() {
        return cliente_pro;
    }

    public void setCliente_pro(Cliente cliente_pro) {
        this.cliente_pro = cliente_pro;
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
