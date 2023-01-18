package Ejercicios_Clases;

public class Simulacro_Prueba {
    int edad = 20;
    public static void main(String[] args) {
        //Ejercicio 1: Crea un método al que se le pase: una tabla rellena de enteros y un entero.
        //Habrá que buscar ese elemento en la tabla.
        int[] tabla = {3,2,1,4};
        buscarElemento(tabla, 5);

        // Ejercicio 2 Ordenar la siguiente tabla [5,7,8,4,3,6,0,0,8,1] de menor a mayor.
      //  int[] tabla2 = {};
        System.out.println(new Simulacro_Prueba().edad);
    }

    public static void buscarElemento(int[] tabla, int e){
        int resultado = -1;

        for (int elemento:tabla){
            if(elemento == e){
                resultado = elemento;
                break;
            }
        }
        boolean trueFalse = resultado == e;

        if(trueFalse){
            System.out.println("Elemento: " + resultado + " econtrado en la tabla.");
        }else {
            System.out.println("Elemento NO econtrado en la tabla.");
        }
    }



    }

