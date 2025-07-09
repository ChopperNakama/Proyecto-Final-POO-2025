/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProductosEmpleadoV1;

/**
 *
 * @author gerardo
 */
public class Administrador extends Usuario implements PoseeCredenciales {

    private boolean superUsuario;
    private String cargo;

    public Administrador(String id, String nombre, String apellido, double pagoPorHora) {
        super(id, nombre, apellido, pagoPorHora);
        this.superUsuario = true;
        this.cargo = "Administrador";
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalario() * 1.2;
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
    //compara si dos referencias apuntan al mismo objeto en memoria por defecto
    @Override
    public boolean equals(Object objetoComparado) {
        if (objetoComparado == null || this.getClass() != objetoComparado.getClass()) {
            return false;
        }
        if (objetoComparado == this) {
            return true;
        }
        Administrador adminComparado = (Administrador) objetoComparado;
        return (this.getId().equals(adminComparado.getId()));
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String getCargo() {
        return this.cargo;
    }

    @Override
    public void setContraseña(String Contraseña) {
        super.setContraseña(Contraseña);
    }

    @Override
    public String toString() {
        return "Usuario encontrado \nNombre: " + super.getNombre() + "\nApellido: " + super.getApellido() + "\nID: " + super.getId() + "\nConstraseña: " + super.getContraseña() + "\nCargo:" + getCargo();
    }
}
