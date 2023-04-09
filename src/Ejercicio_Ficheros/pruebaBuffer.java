package Ejercicio_Ficheros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pruebaBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar nombre:");
        String nombre = br.readLine();
        br.close();

        if(nombre.equalsIgnoreCase("")){
            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }

    }
}
