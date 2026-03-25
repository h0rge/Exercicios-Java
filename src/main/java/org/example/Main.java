package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        // StringOperations
        StringOperations ops = new StringOperations("Cadea", "Cad");
        
        ops.reverseString("Cadea");
        
        // Testing...
        String boldWords = "\\*.+?\\*";
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at hendrerit neque. Aliquam molestie elementum auctor. Etiam tempor augue non condimentum ullamcorper. Donec vitae luctus ex. Sed interdum mauris scelerisque felis hendrerit interdum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Praesent rutrum vel ipsum ac elementum. Donec pharetra, nibh a accumsan posuere, tortor metus porta urna, nec dictum ante turpis at ipsum.Integer id *ultrices* orci, et efficitur nisi. Pellentesque feugiat *nunc* eu nibh eleifend auctor. Vestibulum ante *ipsum* primis in faucibus orci luctus et ultrices posuere cubilia curae; Donec mi ligula, porttitor et faucibus in, rhoncus at ante. Duis a sem *dignissim* eros ultricies egestas finibus a mi. Nullam sollicitudin *pulvinar* sem a vestibulum. Aenean vitae nisi aliquet arcu gravida ullamcorper. Suspendisse bibendum diam nec iaculis sollicitudin. Nullam feugiat est sit amet mauris dignissim gravida.Vivamus tortor velit, ultrices venenatis ipsum quis, sollicitudin commodo nunc. Maecenas a ornare lacus, et euismod lacus. Nulla semper venenatis massa, non volutpat leo pharetra eget. Donec interdum faucibus eros id rhoncus. Nulla quam mi, *condimentum* ac ante vel, volutpat scelerisque nibh. Aenean non tellus dignissim, ullamcorper odio vitae, condimentum lacus. Sed pellentesque eros sed ante vulputate, vitae egestas felis porttitor. Praesent dapibus massa diam, a posuere turpis tristique quis.Fusce eros nunc, condimentum non blandit ut, euismod et justo. Pellentesque sit amet velit eget ipsum efficitur fringilla id a sem. Praesent euismod tortor sit amet nisi accumsan dignissim. Quisque varius cursus lacus, in posuere turpis condimentum sit amet. Maecenas ut metus ullamcorper, porttitor metus nec, condimentum nisi. Pellentesque sagittis hendrerit metus, sed tristique metus dapibus vel. Vivamus semper ex eget enim *euismod* lobortis. Nam vitae tincidunt tellus. Donec nec ante ipsum. Quisque laoreet non arcu a mollis.Suspendisse potenti. Duis consequat purus ac ornare cursus. Aenean lacinia ut felis ornare varius. Quisque tempor volutpat arcu, eget venenatis dui gravida sollicitudin. Vestibulum finibus odio et enim hendrerit, at malesuada turpis imperdiet. Proin sed auctor nulla. Sed tincidunt urna *sollicitudin* dui semper condimentum. Ut non lacus id magna tempor *tempus* eu non quam.";
        Pattern patron = Pattern.compile(boldWords);
        Matcher matcher = patron.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        
        Flower redTulip = new Flower("red", "tulip");
        System.out.println(redTulip.toString());
        */

        // Arraylist exercises
        // Exercise 1

        ArrayList<Integer> grades = new ArrayList<>();
        String goOn = "y";
        int grade;
        do {
            System.out.println("Enter a grade");
            grade = sc.nextInt();
            sc.nextLine();
            grades.add(grade);
            do {
                System.out.println("Do you want to continue (Y/N)");
                goOn = sc.nextLine();
            } while (!goOn.toLowerCase().equals("y") && !goOn.toLowerCase().equals("n"));
        } while (goOn.toLowerCase().equals("y"));
        System.out.println(grades);





        // Código ata aquí
    }
}