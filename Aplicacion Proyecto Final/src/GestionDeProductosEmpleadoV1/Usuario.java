/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProductosEmpleadoV1;

/**
 *
 * @author gerardo
 */
public abstract class Usuario {

    private String id;
    private String nombre;
    private String apellido;
    private double pagoPorHora;
    private double salario;
    private String contraseña;

    public Usuario(String id, String nombre, String apellido, double pagoPorHora) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pagoPorHora = pagoPorHora;
        this.salario = calcularSalarioBase();
        this.contraseña = "admin";
    }

    public double calcularSalarioBase() {
        return pagoPorHora * 8 * 5 * 4;
    }

    public abstract double calcularSalarioFinal();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
