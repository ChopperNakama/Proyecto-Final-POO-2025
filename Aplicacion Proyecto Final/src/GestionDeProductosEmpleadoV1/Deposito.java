/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProductosEmpleadoV1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author gerardo
 */
public class Deposito {

    private Map<String, Integer> precios;
    private Map<String, Integer> stocks;

    public Deposito() {
        this.precios = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String producto, int precio, int stock) {
        precios.put(producto, precio);
        stocks.put(producto, stock);
    }

    public int precio(String producto) {
        if (precios.get(producto) == null) {
            return -99;
        }
        return precios.get(producto);
    }

    public int stock(String producto) {
        if (!stocks.containsKey(producto)) {
            stocks.put(producto, 0);
            return stocks.get(producto);
        }
        return stocks.get(producto);
    }

    public boolean take(String producto) {
        if (stocks.get(producto) != null && stocks.get(producto) > 0) {
            stocks.put(producto, stocks.get(producto) - 1);
            return true;
        }
        return false;
    }

    public Set<String> productos() {
        return this.precios.keySet();
    }

    public String buscar(String nombre) {
        for (String producto : this.productos()) {
            if (producto.equals(nombre)) {
                return "Producto encontrado: " + nombre + "\nPrecio: " + this.precio(nombre) + "\nStock: " + this.stock(producto);
            }
        }
        return null;
    }
}
