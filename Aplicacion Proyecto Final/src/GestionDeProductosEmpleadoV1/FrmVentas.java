/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GestionDeProductosEmpleadoV1;

import javax.swing.table.DefaultTableModel;
import GestionDeProductosEmpleadoV1.*;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author gerardo
 */
public class FrmVentas extends javax.swing.JInternalFrame {

    private Deposito deposito;
    private ShoppingCart carrito;
    private DefaultTableModel modelo;

    /**
     * Creates new form FrmVentas
     */
    public FrmVentas() {
        initComponents();
        inicializarTienda();
    }

    public void inicializarTienda() {
        this.deposito = new Deposito();
        this.carrito = new ShoppingCart();
        deposito.addProduct("Croissant", 4, 15);
        deposito.addProduct("Pan Integral", 3, 20);
        deposito.addProduct("Tarta de Manzana", 6, 5);
        deposito.addProduct("Queque de Vainilla", 5, 10);
        deposito.addProduct("Donas", 2, 25);
        deposito.addProduct("Empanada de Pollo", 4, 12);
        deposito.addProduct("Pan de Chocolate", 3, 18);
        deposito.addProduct("Bizcocho de Zanahoria", 6, 7);
        deposito.addProduct("Alfajor", 2, 30);
        deposito.addProduct("Churro Relleno", 3, 10);
        deposito.addProduct("Pan Francés", 1, 50);
        deposito.addProduct("Pan de Yema", 2, 35);
        deposito.addProduct("Cachito", 3, 20);
        deposito.addProduct("Empanada de Queso", 4, 15);
        deposito.addProduct("Torta Selva Negra", 7, 6);
        deposito.addProduct("Panetón", 10, 10);
        deposito.addProduct("Pastel de Choclo", 5, 8);
        deposito.addProduct("Camote Frito", 2, 25);
        deposito.addProduct("Rosquitas", 2, 40);
        deposito.addProduct("Pan de Anís", 3, 22);
        deposito.addProduct("Pan con Chicharrón", 6, 12);
        deposito.addProduct("Tarta de Fresas", 6, 5);
        deposito.addProduct("Bizcochuelo", 4, 18);
        deposito.addProduct("Volcán de Chocolate", 8, 4);
        deposito.addProduct("Mazamorra Morada", 3, 10);

        String[] columna = {"Nombre", "Precio", "Stock"};
        modelo = new DefaultTableModel(columna, 0);
        tblVentas.setModel(modelo);
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lVentas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        btnAñadirAlCarrito = new javax.swing.JButton();
        btnMostrarTotal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lVentas.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lVentas.setForeground(new java.awt.Color(204, 204, 255));
        lVentas.setText("Ventas");
        getContentPane().add(lVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 0, -1, -1));

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 35, 434, 387));

        btnAñadirAlCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-add-50.png"))); // NOI18N
        btnAñadirAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirAlCarritoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadirAlCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        btnMostrarTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-bill-50.png"))); // NOI18N
        btnMostrarTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTotalActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/20250709_0020_Dulces Delicias_simple_compose_01jzpswcewf6sabsd9aasj4kdf.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirAlCarritoActionPerformed
        // TODO add your handling code here:
        añadirAlCarro();
    }//GEN-LAST:event_btnAñadirAlCarritoActionPerformed

    private void btnMostrarTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTotalActionPerformed
        // TODO add your handling code here:
        if (carrito.print().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El carrito está vacío.");
        } else {
            String mensaje = "Compra #" + 100 + "\n\n"
                    + "Productos en el carrito:\n"
                    + carrito.print()
                    + "\nMonto total: S/. " + carrito.price();
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_btnMostrarTotalActionPerformed
    private void cargarTabla() {
        for (String producto : this.deposito.productos()) {
            try {
                double precio = deposito.precio(producto);
                int stock = deposito.stock(producto);
                Object[] fila = {producto, String.format("S/. %.2f", precio), stock};
                modelo.addRow(fila);
            } catch (Exception e) {
                System.err.println("Error al cargar producto: " + producto + " - " + e.getMessage());
            }
        }
    }

    private void cargarProductos() {
        modelo.setRowCount(0);
        Set<String> listaproductos = deposito.productos();
        for (String producto : listaproductos) {
            Object[] fila = {producto, deposito.precio(producto), deposito.stock(producto)};
            modelo.addRow(fila);
        }
    }

    private void añadirAlCarro() {
        int selectedRow = tblVentas.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un producto");
            return;
        }
        String product = (String) tblVentas.getValueAt(selectedRow, 0);
        if (deposito.take(product)) {
            carrito.add(product, deposito.precio(product));
            cargarProductos();
            JOptionPane.showMessageDialog(this, product + " agregado al carrito");
        } else {
            JOptionPane.showMessageDialog(this, "Producto sin stock disponible");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirAlCarrito;
    private javax.swing.JButton btnMostrarTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lVentas;
    private javax.swing.JTable tblVentas;
    // End of variables declaration//GEN-END:variables
}
