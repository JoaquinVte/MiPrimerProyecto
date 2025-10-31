package es.ieslavereda.recursividad;

public class Ejemplo4 {

    public static void main(String[] args) {

        System.out.println(div(9,4));

    }

    public static int div(int n,int d){

        if(n<d) return 0;

        return 1 +  div(n-d,d);

    }
}
