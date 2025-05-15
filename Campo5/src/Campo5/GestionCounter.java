/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Campo5;

import java.util.ArrayList;

/**
 *
 * @author gerardo
 */
public class GestionCounter {

    private ArrayList<Counter> list;

    public GestionCounter() {
        this.list = new ArrayList();
    }

    public void addList(Counter counter) {
        list.add(counter);
    }

    public double calPromedio() {
        int total = 0;
        for (Counter elem : list) {
            total += elem.value();
        }
        return (total * 1.0) / this.list.size();
    }

    public Counter menor() {
        Counter menor = list.get(0);
        for (Counter c : list) {
            if (c.value() < menor.value()) {
                menor = c;
            }
        }
        return menor;
    }

    public Counter mayor() {
        Counter mayor = list.get(0);
        for (Counter c : list) {
            if (c.value() > mayor.value()) {
                mayor = c;
            }
        }
        return mayor;
    }

    public void resetearTodos() {
        for (Counter c : list) {
            c.decrease(c.value()); // se convierte en 0
        }
    }

    public void duplicarTodos() {
        for (Counter c : list) {
            c.increase(c.value()); // duplica el valor
        }
    }
}
