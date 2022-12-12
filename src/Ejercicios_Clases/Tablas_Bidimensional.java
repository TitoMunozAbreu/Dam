package Ejercicios_Clases;

import java.util.Scanner;

public class Tablas_Bidimensional {

    public static void main(String[] args) {
        //incializar matriz de 5x5
        int[][] matriz = new int [5][5];
        //funcion para introducir elementos en la funcion
        rellenarMatriz(matriz);
        //mostrar por consola matriz
        mostrarMatriz(matriz);
    }

    /**
     * METODO PARA INSERTAR ELELEMENTOS EN LA MATRIZ
     * @param matriz le pasamos la matriz a rellenar
     */
    public static int[][] rellenarMatriz(int[][] matriz){
        Scanner sc = new Scanner(System.in);
        //recorrer la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingresar elemento en la fila " + i + " de la columa " +  j + ":");
                //introducir los elementos por consola
                matriz[i][j] = Integer.parseInt(sc.next());
            }
        }
        //informar que la matriz se ha completado
        System.out.println("Matriz rellenada");
        System.out.println();
        return matriz;
    }

    /**
     * METODO PARA MOSTAR MATRIZ
     * @param  matriz le pasamos la matriz a rellenar
     */
    public static void mostrarMatriz(int[][] matriz){
        //recorrer la matriz
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //mostar por consola
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }
    }
}
