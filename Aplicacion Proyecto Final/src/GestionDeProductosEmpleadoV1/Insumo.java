/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProductosEmpleadoV1;

/**
 *
 * @author gerardo
 */
public class Insumo implements Comparable<Insumo> {

    private double cantidad;
    private String nombre;
    private String id;
    private String fechaDeVencimiento;
    private String unidades;

    public Insumo(double cantidad, String nombre, String id, String fechaDeVencimiento, String unidades) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.id = id;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.unidades = unidades;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Insumo encontrado con ID: " + this.id + "\nNombre: " + this.nombre + "\nCantidad: " + this.cantidad + " " + this.unidades + "\nFecha de vencimineto: " + this.fechaDeVencimiento;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Insumo insumoCompared = (Insumo) object;
        return this.id.equals(insumoCompared.id);
    }

    @Override
    public int compareTo(Insumo i) {
        return this.getNombre().compareToIgnoreCase(i.getNombre());
    }
}
