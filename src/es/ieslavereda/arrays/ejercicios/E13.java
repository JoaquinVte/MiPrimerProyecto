package es.ieslavereda.arrays.ejercicios;

import java.util.Arrays;

import static es.ieslavereda.arrays.ejercicios.E12.show;

public class E13 {

    public static void main(String[] args) {

        int[] array = new int[0];

        for(int i=1;i<=10;i++)
            array = fill(array,i);

        show(array);

    }

    public static int[] fill(int[] v, int value){
        int[] aux = new int[v.length+value];

        // Copiar v en aux
        for(int i=0;i<v.length;i++)
            aux[i]=v[i];

        // Completar con value
        for(int i=v.length;i<aux.length;i++)
            aux[i]=value;

        return aux;
    }

}
