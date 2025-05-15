/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Campo5;

import java.util.Scanner;

/**
 *
 * @author gerardo
 */
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionCounter objGestionCounter = new GestionCounter();

        while (true) {
            System.out.println("Ingrese el valor inicial del objeto , -1 para detener");
            try {
                int val = Integer.parseInt(scanner.nextLine());
                if (val == -1) {
                    break;
                }
                Counter num = new Counter(val);
                objGestionCounter.addList(num);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + ". Ingrese solo numeros.");
            }
        }
        System.out.println("Promedio de los numeros ingresados:");
        System.out.println(objGestionCounter.calPromedio());
        System.out.println("El menor valor del arrayList es:");
        System.out.println(objGestionCounter.menor());
        System.out.println("El mayor valor del arrayList es:");
        System.out.println(objGestionCounter.mayor());
    }
}
