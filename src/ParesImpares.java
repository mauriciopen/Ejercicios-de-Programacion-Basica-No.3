/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {
        int n;
        int num;
        System.out.println("¿Cuantos numeros desea ingresar?");
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        int sumapar = 0;
        int sumaimpar = 0;
        for (int i = 0; i < n; i++) {
            num = reader.nextInt();
            if (num % 2 == 0) {
                pares.add(num);
                sumapar = sumapar + num;
            } else {
                impares.add(num);
                sumaimpar = sumaimpar + num;
            }
        }
        System.out.println("Cantidad pares: " + String.valueOf(pares.size()) + "\n"
                + "Cantidad impares: " + String.valueOf(impares.size()) + "\n"
                + "Suma pares:" + String.valueOf(sumapar) + "\n"
                + "Suma impares:" + String.valueOf(sumaimpar) + "\n");
    }

}
