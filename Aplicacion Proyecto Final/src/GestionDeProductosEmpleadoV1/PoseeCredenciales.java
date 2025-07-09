/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GestionDeProductosEmpleadoV1;

/**
 *
 * @author gerardo
 */
public interface PoseeCredenciales {

    String getId();

    String getContraseña();
    
    boolean esSuperUsuario();
    
    String getNombre();
    
    String getApellido();
    
    String getCargo();
    
    void setContraseña(String contraseña);
    
}
