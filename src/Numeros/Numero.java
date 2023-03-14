package Numeros;

import java.util.Collections;
import java.util.LinkedList;

public class Numero {
    LinkedList<Integer> numeros;

    public Numero(){
        this.numeros =new LinkedList<>();
    }

    public void ingresarNumeros(int numero){
        numeros.add(numero);
        System.out.println("\n Numero: " + numero + " ingresado");
    }

    public void ordenarNumeros(){
        Collections.sort(numeros);
    }

    public void ordenarDescendientes(){
        Collections.reverse(numeros);
    }

    public void mostrarNumeros(){
        numeros.forEach(System.out::println);
    }

}
