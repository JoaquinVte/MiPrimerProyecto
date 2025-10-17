package es.ieslavereda.arrays.ejercicios;

import java.util.Scanner;

public class E2 {

    // Actualizacion

    public static void main(String[] args) {

        float[] numeros = new float[10];

        rellenar(numeros);
        mostrar(numeros);
        System.out.println("La suma es: " + suma(numeros));
        maxMin(numeros);
        int[] posMaxMin = maxMinPos(numeros);
        int max =posMaxMin[0];
        int min = posMaxMin[1];
        System.out.println("Pos max: "+ max +",Max: " + numeros[max] +" -  Pos min: " +min+" Min: "+ numeros[min]);

        sumaPostivosNegativos(numeros);
        System.out.println("La media es: " + media(numeros));

    }

    public static void rellenar(float[] numeros) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero:");
            numeros[i] = sc.nextFloat();
        }
    }

    public static void mostrar(float[] numeros) {
        for (int i = 0; i < numeros.length; i++)
            System.out.print(numeros[i]+" ");
        System.out.println();
    }

    public static float suma(float[] numeros){
        float suma=0;

        for (int i = 0; i < numeros.length; i++)
            suma+=numeros[i];

        return suma;
    }

    public static void maxMin(float[] numeros){

        float max = numeros[0];
        float min = numeros[0];

        for (int i = 1; i < numeros.length; i++){

            if(numeros[i]>max)
                max = numeros[i];
            else if(numeros[i]<min)
                min = numeros[i];

        }
        System.out.println("Max: " + max +"  Min: " + min);
    }

    public static void sumaPostivosNegativos(float[] numeros){

        float positivos=0;
        float negativos=0;

        for (int i = 0; i < numeros.length; i++){

            if(numeros[i]<0)
                negativos+=numeros[i];
            else
                positivos+=numeros[i];

        }
        System.out.println("Positivos: " + positivos +"  Negativos: " + negativos);

    }

    public static float media(float[] numeros){
        return suma(numeros)/ numeros.length;
    }

    public static int[] maxMinPos(float[] numeros){

        int max = 0;
        int min = 0;

        for (int i = 1; i < numeros.length; i++){

            if(numeros[i]>numeros[max])
                max = i;
            else if(numeros[i]<numeros[min])
                min = i;

        }

        return new int[]{max,min};


    }
}
