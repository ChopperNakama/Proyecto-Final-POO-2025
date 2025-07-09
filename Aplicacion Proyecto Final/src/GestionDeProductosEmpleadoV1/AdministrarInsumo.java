/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProductosEmpleadoV1;

import java.util.ArrayList;

/**
 *
 * @author gerardo
 */
public class AdministrarInsumo {

    private ArrayList<Insumo> insumos;

    public AdministrarInsumo() {
        insumos = new ArrayList();
    }

    public boolean añadirInsumo(Insumo i) {
        if (insumos.contains(i)) {
            return false;
        }
        insumos.add(i);
        return true;
    }

    public void eliminarInsumo(int indice) {
        this.insumos.remove(indice);
    }

    public ArrayList<Insumo> obtenerInsumos() {
        return insumos;
    }

    public boolean noEstaCompleto(Insumo i) {
        return i.getNombre() == null || i.getNombre().trim().isEmpty()
                || i.getId() == null || i.getId().trim().isEmpty()
                || i.getFechaDeVencimiento() == null || i.getFechaDeVencimiento().trim().isEmpty()
                || i.getCantidad() <= 0 || i.getUnidades().equals("-Seleccionar-");
    }

    public Insumo buscar(String id) {
        for (Insumo i : insumos) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }
}
