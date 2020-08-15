/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Scanner;


public class Empleado {

    public static void main(String[] args) {
        int num_empleados = 0;
        int sueldo_base = 980657;
        int num_ventas = 0;
        double total_comisiones = 0;
        double total_sueldos = 0;
        boolean rep = false;
        boolean error = false;
        int opc;
        Scanner reader = new Scanner(System.in);
        do {
            ArrayList<Double> comisiones_totales = new ArrayList<>();

            System.out.println("Ingrese el numero de empleados");
            num_empleados = reader.nextInt();
            for (int i = 0; i < num_empleados; i++) {
                System.out.println("¿Cuantas ventas realizo el empleado " + String.valueOf(i));
                num_ventas = reader.nextInt();
                double suma = 0;
                for (int j = 0; j < num_ventas; j++) {
                    System.out.println("¿Cual fue el valor de la venta " + String.valueOf(i) + "?");
                    double valor = reader.nextDouble();
                    valor = (valor * 10) / 100;
                    suma = suma + valor;
                }
                comisiones_totales.add(suma);
            }
            for (int i = 0; i < num_empleados; i++) {
                System.out.println("Al empleado " + String.valueOf(i) + " le debe pagar:\n"
                        + String.valueOf(sueldo_base + comisiones_totales.get(i)));
                total_comisiones = total_comisiones + comisiones_totales.get(i);

            }
            total_sueldos = sueldo_base * num_empleados;
            System.out.println("Concepto sueldos: " + String.valueOf(total_sueldos));
            System.out.println("Concepto comisiones: " + String.valueOf(total_comisiones));
        } while (rep);
        do {
            error = false;
            System.out.println("¿Desea volver a intertarlo?\n"
                    + "(1)Si\n"
                    + "(2)No");
            opc = reader.nextInt();
            switch (opc) {
                case 1:
                    rep = true;
                    break;
                case 2:
                    rep = false;
                    break;
                default:
                    error = true;
                    System.out.println("Opcion invalida");
            }
        } while (error);

    }

}
