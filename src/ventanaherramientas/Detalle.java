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
public class Detalle {
    private int codigo_det;
    private int cantidad_det;
    private float precio_det;

    public Detalle(int codigo_det, int cantidad_det, float precio_det) {
        this.codigo_det = codigo_det;
        this.cantidad_det = cantidad_det;
        this.precio_det = precio_det;
    }

    public int getCodigo_det() {
        return codigo_det;
    }

    public void setCodigo_det(int codigo_det) {
        this.codigo_det = codigo_det;
    }

    public int getCantidad_det() {
        return cantidad_det;
    }

    public void setCantidad_det(int cantidad_det) {
        this.cantidad_det = cantidad_det;
    }

    public float getPrecio_det() {
        return precio_det;
    }

    public void setPrecio_det(float precio_det) {
        this.precio_det = precio_det;
    }
    public float calcularPrecio(){
        return (0);
    }
}
