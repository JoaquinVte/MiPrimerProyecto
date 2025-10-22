package es.ieslavereda.arrays.ejemplos;

import java.util.Scanner;

public class Ejemplo9 {

    public static void main(String[] args) {

        String[] nombres = new String[4];
        int[] edades = new int[4];

        fill(nombres,edades);
        show(nombres,edades);
        int edad = edadMinima(edades);

        mostrarNombresConEdad(nombres,edades,edad);

    }

    private static void mostrarNombresConEdad(String[] nombres,int[] edades ,int edad) {

        for (int i=0;i<edades.length;i++)
            if(edades[i]==edad)
                System.out.println(nombres[i]);

    }

    private static int edadMinima(int[] edades) {
        int edadMinima = edades[0];
        for(int edad : edades)
            edadMinima = Math.min(edadMinima,edad);

        return edadMinima;
    }

    private static void show(String[] nombres, int[] edades) {

        for(int i=0;i<nombres.length;i++)
            System.out.println(nombres[i]+ " -> " +edades[i]);

    }

    private static void fill(String[] nombres, int[] edades) {

        Scanner sc = new Scanner(System.in);

        for(int i=0;i< nombres.length;i++){

            System.out.println("Introduce el nombre para la "+(i+1)+"º persona:");
            nombres[i] = sc.nextLine();

            System.out.println("Introduce la edad para " + nombres[i]);
            edades[i]=Integer.parseInt(sc.nextLine());

        }

    }

}
