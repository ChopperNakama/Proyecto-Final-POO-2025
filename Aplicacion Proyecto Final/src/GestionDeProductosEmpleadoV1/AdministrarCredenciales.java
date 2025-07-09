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
public class AdministrarCredenciales {

    private List<PoseeCredenciales> credenciales;

    public AdministrarCredenciales() {
        this.credenciales = new ArrayList<>();
    }

    public boolean añadirCredencial(PoseeCredenciales p) {
        for (PoseeCredenciales existingUser : credenciales) {
            if (existingUser.getId().equals(p.getId())) {
                return false;
            }
        }
        this.credenciales.add(p);
        return true;
    }

    public void eliminarCredencial(int indice) {
        this.credenciales.remove(indice);
    }

    public List<PoseeCredenciales> obtenerCredenciales() {
        return credenciales;
    }

    public boolean noEstaCompleto(PoseeCredenciales p) {
        return (p.getNombre() == null || p.getNombre().trim().isEmpty())
                || (p.getApellido() == null || p.getApellido().trim().isEmpty())
                || (p.getContraseña() == null || p.getContraseña().trim().isEmpty())
                || (p.getId() == null || p.getId().trim().isEmpty());
    }

    public PoseeCredenciales buscar(String id) {
        for (PoseeCredenciales p : credenciales) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}
