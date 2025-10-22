package es.ieslavereda.arrays.ejemplos;

public class Ejemplo8 {
    public static void main(String[] args) {

        double[][] precios = new double[][]{
                {3,5,0.1},
                {2,1},
                {5,3,99,100}
        };

//        precios[0][0] = 7.5;
//        precios[0][1] = 12;
//        precios[0][2] = 0.99;
//        precios[1][0] = 4.75;

        for(int fil=0;fil< precios.length;fil++){
            for(int col=0;col < precios[fil].length;col++)
                System.out.print(precios[fil][col]+" ");

            System.out.println();
        }



    }
}
