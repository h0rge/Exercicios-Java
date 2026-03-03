package org.example;

import java.lang.reflect.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //Exercicio 1: Crear un array unidimensional
        Scanner sc = new Scanner(System.in);
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

        for (int i = 0; i < 200; i++) {

        }

        // Work plz

        // Código ata aquí
    }
}

