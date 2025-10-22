package es.ieslavereda.arrays.ejercicios;

import java.util.Scanner;

public class E12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] secuencia;
        int v;
        int i;
        int n;

        System.out.println("Introduce el valor inicial:");
        v=sc.nextInt();

        System.out.println("Introduce el incremento:");
        i=sc.nextInt();

        System.out.println("Introduce la cantidad de elementos:");
        n= sc.nextInt();

        secuencia = new int[n];

        fill(secuencia,v,i);
        show(secuencia);

    }

    public static void show(int[] secuencia) {
        for (int numero : secuencia)
            System.out.print(numero+" ");

        System.out.println();
    }

    private static void fill(int[] secuencia, int v, int i) {

        for(int j=0;j< secuencia.length;j++,v+=i)
            secuencia[j] = v;

    }
}
