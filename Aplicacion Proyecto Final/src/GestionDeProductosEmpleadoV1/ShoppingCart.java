/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProductosEmpleadoV1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gerardo
 */
public class ShoppingCart {

    private Map<String, Item> map;

    public ShoppingCart() {
        this.map = new HashMap<>();
    }

    public void add(String producto, int precio) {
        if (map.containsKey(producto)) {
            map.get(producto).incrementarCantidad();
        } else {
            this.map.put(producto, new Item(producto, 1, precio));
        }
    }

    public int price() {
        int total = 0;
        for (String producto : this.map.keySet()) {
            total += map.get(producto).precio();
        }
        return total;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for (Item item : map.values()) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
