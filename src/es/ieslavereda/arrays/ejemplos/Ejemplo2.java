package es.ieslavereda.arrays.ejemplos;

public class Ejemplo2 {

    public static void main(String[] args) {

        double[] aleatorios = new double[10];

        rellenar(aleatorios);
        mostrar(aleatorios);

    }
    public static void rellenar(double[] aleatorios){
        for (int i = 0; i < aleatorios.length; i++)
            aleatorios[i] = Math.random();
    }
    public static void mostrar(double[] aleatorios){
        for (int i=0;i<aleatorios.length;i++)
            System.out.println(aleatorios[i]);
    }
}
