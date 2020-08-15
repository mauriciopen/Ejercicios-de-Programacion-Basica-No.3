/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

public class Potencias {

    public static void main(String[] args) {
        int num = 1;
        double potencia = 0;
        do {
            Scanner reader = new Scanner(System.in);
            num = reader.nextInt();
            if (num < 0) {
                potencia = Math.pow(num, 2);
            } else {
                potencia = Math.pow(num, 3);
            }
            System.out.println(String.valueOf(potencia));

        } while (num != 0);

    }

}
