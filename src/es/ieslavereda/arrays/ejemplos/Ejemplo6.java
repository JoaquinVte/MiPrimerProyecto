package es.ieslavereda.arrays.ejemplos;

public class Ejemplo6 {

    public static void main(String[] args) {

        String[] lanzamientos = new String[10];

        lanzarMonedas(lanzamientos);


        int[] resultado = contar(lanzamientos);

        System.out.println("Cara: " + resultado[0]);
        System.out.println("Cruz: " + resultado[1]);

    }
    private static void lanzarMonedas(String[] lanzamientos) {
        for(int i=0;i<lanzamientos.length;i++)
            lanzamientos[i]=(Math.random()<0.5)?"Cara":"Cruz";

    }

    private static int[] contar(String[] lanzamientos) {
        int cara=0;
        int cruz=0;

        for(String lanzamiento : lanzamientos) {
            if(lanzamiento.equals("Cara"))
                cara++;
            else
                cruz++;
        }

        return new int[]{cara,cruz};
    }
}
