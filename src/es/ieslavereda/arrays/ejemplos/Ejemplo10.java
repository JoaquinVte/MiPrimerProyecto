package es.ieslavereda.arrays.ejemplos;

import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {

        String[][] personas = new String[2][4];


        fill(personas);
        show(personas);

    }

    private static void show(String[][] personas) {

        for(int i=0;i<personas[0].length;i++)
            System.out.println(personas[0][i]+ " -> " +personas[1][i]);

    }

    private static void fill(String[][] personas) {

        Scanner sc = new Scanner(System.in);

        for(int col=0;col< personas[0].length ; col++){

            System.out.println("Introduce el nombre para la "+(col+1)+"º persona:");
            personas[0][col] = sc.nextLine();

            System.out.println("Introduce la edad para " + personas[0][col]);
            personas[1][col]=sc.nextLine();

        }

    }
}
