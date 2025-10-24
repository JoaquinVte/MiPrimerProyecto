package es.ieslavereda.arrays.ejercicios;

import java.util.Scanner;

public class EjercicioNotas {

    public static void main(String[] args) {
        int alumnos = 5;
        int asignaturas = 6;

        String[][] notas = new String[asignaturas+1][alumnos+1];
        notas[0][0]="";

        rellenarAlumnos(notas);
        rellenarAsignaturas(notas);
        rellenarNotas(notas);

        show(notas);

    }

    //  [1][1] - [1][notas[0].length -1]
    //  ...
    //  [notas.length -1][1]  - [notas.length -1][notas[0].length -1]
    private static void rellenarNotas(String[][] notas) {
        for(int fil=1;fil<notas.length;fil++)
            for(int col=1;col<notas[fil].length;col++)
                notas[fil][col] = String.valueOf(((int)(Math.random()*1000))/100f);
    }

    // [1][0] - [notas.length-1][0]
    private static void rellenarAsignaturas(String[][] notas) {
        Scanner sc = new Scanner(System.in);

        for(int fila=1;fila<notas.length;fila++){
            System.out.println("Introduce la " + fila + "º asignatura:");
            notas[fila][0]=sc.nextLine();
        }
    }

    // [0][1] - [0][notas[0].length-1]
    private static void rellenarAlumnos(String[][] notas) {

        Scanner sc = new Scanner(System.in);

        for(int col=1;col<notas[0].length;col++){
            System.out.println("Introduce el  " + col + "º alumno:");
            notas[0][col]=sc.nextLine();
        }
    }

    public static void show(String[][] notas){
        for(int fila=0;fila<notas.length;fila++){
            for(int col=0;col<notas[0].length;col++){
                System.out.print(notas[fila][col] + "\t");
            }
            System.out.println();
        }

    }


}
