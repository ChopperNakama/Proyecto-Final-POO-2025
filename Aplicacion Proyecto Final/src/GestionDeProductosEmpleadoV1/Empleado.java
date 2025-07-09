/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProductosEmpleadoV1;

/**
 *
 * @author gerardo
 */
public class Empleado extends Usuario implements PoseeCredenciales, Comparable<Empleado> {

    private String cargo;
    private int horasExtras;
    private boolean superUsuario;

    public Empleado(String cargo, int horasExtras, String id, String nombre, String apellido, double pagoPorHora) {
        super(id, nombre, apellido, pagoPorHora);
        this.cargo = cargo;
        this.horasExtras = horasExtras;
        this.superUsuario = false;
    }

    @Override
    public String getCargo() {
        return this.cargo;
    }

    public int getHorasExtras() {
        return this.horasExtras;
    }

    public String getNivelCansancio() {
        if (this.horasExtras == 0) {
            return "Normal";
        } else if (this.horasExtras <= 10) {
            return "Cansado";
        } else {
            return "Exhausto";
        }
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalario() + this.horasExtras * getPagoPorHora() * 0.5;
    }

    @Override
    public boolean equals(Object objetoComparado) {
        if (objetoComparado == null || this.getClass() != objetoComparado.getClass()) {
            return false;
        }
        if (objetoComparado == this) {
            return true;
        }

        Empleado empleadoComparado = (Empleado) objetoComparado;
        return (this.getId().equals(empleadoComparado.getId()));
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getContraseña() {
        return super.getContraseña();
    }

    @Override
    public boolean esSuperUsuario() {
        return this.superUsuario;
    }

    public void promoverASuperUsuario() {
        this.superUsuario = true;
    }

    public void degradarDeSuperUsuario() {
        this.superUsuario = false;
    }

    @Override
    public String toString() {
        return "Empleado encontrado con ID: " + getId() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nPago por hora: " + getPagoPorHora() + "\nCargo: " + this.getCargo() + "\nHoras extras: " + this.getHorasExtras();
    }

    @Override
    public void setContraseña(String Contraseña) {
        super.setContraseña(Contraseña);
    }

    @Override
    public int compareTo(Empleado e) {
        return super.getNombre().compareToIgnoreCase(e.getNombre());
    }
}
