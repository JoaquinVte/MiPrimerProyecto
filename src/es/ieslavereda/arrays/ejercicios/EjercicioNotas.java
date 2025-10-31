package es.ieslavereda.arrays.ejercicios;

import java.util.Scanner;

public class EjercicioNotas {

    public static void main(String[] args) {
        int alumnos = 5;
        int asignaturas = 6;

        String[][] notas = new String[asignaturas+2][alumnos+2];
        notas[0][0]="  ";
        notas[notas.length-1][notas[0].length-1]="  ";
        notas[0][notas[0].length-1]="MEDIA";
        notas[notas.length-1][0]="MEDIA";

        rellenarAlumnos(notas);
        rellenarAsignaturas(notas);
        rellenarNotas(notas);

        calcularMediasAlumno(notas);
        calcularMediasAsignatura(notas);

        show(notas);

    }

    private static void calcularMediasAsignatura(String[][] notas) {
        float suma;
        for(int fila=1;fila<notas.length-1;fila++) {
            suma = 0;
            for (int col = 1; col < notas[0].length - 1; col++)
                suma += Float.parseFloat(notas[fila][col]);

            notas[fila][notas[0].length-1]=String.valueOf ((int)((suma/(notas[0].length-2))*100)/100f);

        }

    }

    private static void calcularMediasAlumno(String[][] notas) {
        float suma;
        for(int col=1;col<notas[0].length-1;col++){
            suma=0;
            for(int fil=1;fil< notas.length-1;fil++){
                suma+=Float.parseFloat(notas[fil][col]);
            }
            notas[notas.length-1][col] = String.valueOf ((int)((suma/(notas.length-2))*100)/100f);
        }

    }

    private static void rellenarNotas(String[][] notas) {
        for(int fil=1;fil<notas.length-1;fil++)
            for(int col=1;col<notas[fil].length-1;col++)
                notas[fil][col] = String.valueOf(((int)(Math.random()*1000))/100f);
    }


    private static void rellenarAsignaturas(String[][] notas) {
        Scanner sc = new Scanner(System.in);

        for(int fila=1;fila<notas.length-1;fila++){
            System.out.println("Introduce la " + fila + "º asignatura:");
            notas[fila][0]=sc.nextLine();
        }
    }


    private static void rellenarAlumnos(String[][] notas) {

        Scanner sc = new Scanner(System.in);

        for(int col=1;col<notas[0].length-1;col++){
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
