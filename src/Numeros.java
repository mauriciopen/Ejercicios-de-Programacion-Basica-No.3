/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        int n = 0;
        int num = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            num = reader.nextInt();
            numeros.add(num);
        }
        for (int i = 0; i < numeros.size(); i++) {/*Ordenamos los elementos del array de mayor a menor*/
            for (int j = 0; j < numeros.size() - 1; j++) {
                if (numeros.get(i) > numeros.get(j)) {
                    int temp1 = numeros.get(i);
                    int temp2 = numeros.get(j);
                    numeros.set(i, temp2);
                    numeros.set(j, temp1);
                }
            }

        }
        double promedio = 0;
        for (int i = 0; i < numeros.size(); i++) {
            promedio = promedio + numeros.get(i);
        }
        promedio = promedio / n;
        System.out.println("Menor: " + String.valueOf(numeros.get(numeros.size() - 1)));
        System.out.println("Mayor: " + String.valueOf(numeros.get(0)));
        System.out.println("Promedio: " + String.valueOf(promedio));

    }

}
