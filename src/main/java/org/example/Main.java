package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        /*
        //Exercicio 1: Crear un array unidimensional
        double[] grades;
        int length;
        System.out.println("How many grades do you want to store?");
        length = sc.nextInt();
        grades = new double[length];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Introduce unha nota");
            grades[i] = sc.nextInt();
        }
        // Average
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        System.out.println("A media de todas as notas é " + total / grades.length);


        // Exercicio 2: Arrays impares e pares

        int[] even;
        int[] odd;

        even = new int[100];
        odd = new int[100];

        for (int i = 2; i <= 200; i++) {
            if (i % 2 == 0) {
                even[i/2-1] = i;
            }
        }
        for (int i = 1; i < 200; i++) {
            if (i % 2 != 0) {
                odd[i/2] = i;
            }
        }
        for (int num : even) {
            System.out.println(num);
        }

        for (int numo : odd) {
            System.out.println(numo);
        }
        */

        //Exercicio ArrayList 1

        ArrayList<Integer> grades = new ArrayList<>();
        int total = 0;
        int grade = 0;
        int i = 0;
        do {
            System.out.println("Introduce unha nota ou entra -1 para saír");
            grade = sc.nextInt();
            grades.add(i,10);
            i++;
        } while (grade != -1);
        System.out.println("Grades: ");
        for (Integer gradle : grades) {
            System.out.println(gradle);
            total += gradle;
        }












        // Código ata aquí
    }
}











