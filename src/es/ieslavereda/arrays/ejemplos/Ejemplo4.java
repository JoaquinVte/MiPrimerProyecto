package es.ieslavereda.arrays.ejemplos;

import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        String[] nombres  = new String[4];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<nombres.length;i++){
            System.out.println("Introduce el"+ (i+1) +"º nombre ");
            nombres[i]=sc.nextLine();
        }

        mostrar(nombres);

    }

    public static void mostrar(String[] nombres){
        for (int i=0;i<nombres.length;i++)
            System.out.println(nombres[i]);
    }
}
