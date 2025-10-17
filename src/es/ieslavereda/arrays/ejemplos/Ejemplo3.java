package es.ieslavereda.arrays.ejemplos;

public class Ejemplo3 {
    public static void main(String[] args) {

        int[] numeros = new int[]{1,2,3,88};

        float[] alturas = new float[]{1.85f,2.01f,1.76f};

        for(int i=0;i<alturas.length;i++)
            System.out.println(i+" -> "+alturas[i]);
    }
}
