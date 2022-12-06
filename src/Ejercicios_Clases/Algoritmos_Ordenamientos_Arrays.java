package Ejercicios_Clases;

import java.util.Arrays;

public class Algoritmos_Ordenamientos_Arrays {
    public static void main(String[] args) {
        int [] n = {5, 2, 1, 8, 3, 9, 7};
        //mostar por pantalla el array sin ordenar
        System.out.println("Array SIN ordenar: " + Arrays.toString(n));
        System.out.println();

        //Le pasamos el array, el segundo parametro es cero por defecto
        //el tercer parametro es el ultimo indice del array

        System.out.println("Array Ordenado: " + Arrays.toString(quicksort(n,0,n.length-1)));
        //mostrar por pantalla el array ordenado


    }

    public static int[] quicksort(int[]arreglo, int primero, int ultimo){
        //Incializamos 4 variables
        int i, j, auxiliar, pivote;
        i = primero; // indice i toma el valor de primero
        j = ultimo; // indice j toma el valor de ultimo
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






}
