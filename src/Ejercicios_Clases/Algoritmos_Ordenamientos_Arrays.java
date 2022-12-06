package Ejercicios_Clases;

import java.util.Arrays;

public class Algoritmos_Ordenamientos_Arrays {
    public static void main(String[] args) {
        int [] arreglo = {5, 2, 1, 8, 3, 9, 7};

        //mostar por pantalla el array sin ordenar
        System.out.println("Array SIN ordenar: " + Arrays.toString(arreglo));

        //mostrar array ordenado con el metodo quicksort
        //System.out.println("Metodo quicksort - array rrdenado: " + Arrays.toString(quicksort(arreglo,0,arreglo.length-1)));

        //mostrar array ordenado con el metodo burbuja
        System.out.println("Metodo burbuja - array ordenado: " + Arrays.toString(burbuja(arreglo)));


    }

    /**
     *   METODO SEGUN EL ALGORITMO QUICKSORT
     * @param arreglo Le pasamos el array que se quiere ordenar
     * @param primero Por defecto es el primer indice del array 0
     * @param ultimo Utilizamos el ultimo indice del  array -1
     * @return Devuelve el array ordenado
     */
    public static int[] quicksort(int[]arreglo, int primero, int ultimo){
        //Incializamos 4 variables
        int i, j, auxiliar, pivote;
        i = primero; // indice i toma el valor del primer indice
        j = ultimo; // indice j toma el valor del ultimo indice
        pivote = arreglo[(primero+ultimo)/2]; //el pivote para compararlo con la posicion del primero y el ultimo

        do {//Do mientras primero sea menor igual a ultimo

            //Para incrementar indice i
            while(arreglo[i] < pivote){//mientras primero sea menor a pivote
                i++;
            }
            //Para disminuir indice j
            while (arreglo[j] > pivote){//mientras ultimo sea mayor o igual a pivote
                j--;
            }

            //Aqui realizamos el intercambio
            if(i <= j){
                auxiliar = arreglo[i]; //almacenamos el valor del array en la posicion de i
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++; // incrementar el indice i
                j--; // decrementar el indice j
            }

        }while (i<=j);

        //Recursividad para las sub listas, sus divisiones para terminar mas rapido
        if(primero <  j){//si primero es menor a j
            quicksort(arreglo, primero, j);
        }
        if(ultimo > i ){
            quicksort(arreglo, i, ultimo);
        }

        return arreglo;

    }

    /**
     * METODO SEGUN EL ALGORITMO BURBURJA
     * @param arreglo Le array que se quiere ordenar.
     * @return Devuelve el array ordenado
     */
    public static int[] burbuja(int[] arreglo){
        //Variable para utilizar en el intercambio
        int temporal;

        //Recorrer el array
        for (int i = 0; i < arreglo.length; i++) {
            for(int j = i+1; j < arreglo.length; j++){
                //Comprobar si la primera posicion del array es mayor a la siguiente posicion.
                if(arreglo[i] > arreglo[j]){
                    //Realizar el intercambio
                    temporal = arreglo[i]; // guardamos en auxiliar el valor de la primera posicion.
                    arreglo[i] = arreglo[j]; //actualizamos el valor de la primera posicion con el menor valor de la segunda posicion
                    arreglo[j] = temporal; // actualizamos el valor de la segunda posicion con el valor mayor de la primera posicion
                }
            }
        }
        return arreglo;
    }

    /**
     * METODO SEGUN EL ALGORITMO SHELL
     * @return Devuelve el array ordenado
     */
    public static int[] shell(int[] arreglo){
        return arreglo;

    }







}
