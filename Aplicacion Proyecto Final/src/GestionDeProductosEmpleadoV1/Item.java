/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProductosEmpleadoV1;

/**
 *
 * @author gerardo
 */
public class Item {

    private String producto;
    private int cantidad;
    private int precioPorUnidad;

    public Item(String producto, int cantidad, int precioPorUnidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioPorUnidad = precioPorUnidad;
    }

    public int precio() {
        return this.cantidad * this.precioPorUnidad;
    }

    public void incrementarCantidad() {
        this.cantidad += 1;
    }

    @Override
    public String toString() {
        return this.producto + ": " + this.cantidad;
    }
}
