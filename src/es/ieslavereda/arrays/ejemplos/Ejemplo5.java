package es.ieslavereda.arrays.ejemplos;

public class Ejemplo5 {
    public static void main(String[] args) {

        int a = 0;
        int[] b = new int[]{0};

        suma(a);
        suma(b);

        System.out.println("a = " + a );
        System.out.println("b[0] = " + b[0]);
    }

    private static void suma(int a) {
        a++;
        System.out.println("Method a = " + a );
    }
    private static void suma(int[] b) {
        b[0]++;
        System.out.println("Method b[0] = " + b[0]);
    }
}
