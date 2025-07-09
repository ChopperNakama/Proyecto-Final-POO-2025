/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProductosEmpleadoV1;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author gerardo
 */
public class AdministrarEmpleado {

    private List<Empleado> empleados;

    public AdministrarEmpleado() {
        this.empleados = new ArrayList<>();
    }

    public boolean añadirEmpleado(Empleado e) {
        if (this.empleados.contains(e)) {
            return false;
        }
        this.empleados.add(e);
        return true;
    }

    public void eliminarEmpleado(int indice) {
        this.empleados.remove(indice);
    }

    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }

    public boolean noEstaCompleto(Empleado e) {
        return e.getNombre() == null || e.getNombre().trim().isEmpty()
                || e.getId() == null || e.getId().trim().isEmpty()
                || e.getApellido() == null || e.getApellido().trim().isEmpty()
                || e.getCargo() == null || e.getCargo().trim().isEmpty()
                || e.getHorasExtras() < 0
                || e.getPagoPorHora() < 0;
    }

    public Empleado buscar(String id) {
        for (Empleado e : empleados) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }
}
