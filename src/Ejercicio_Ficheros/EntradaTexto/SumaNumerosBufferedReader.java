package Ejercicio_Ficheros.EntradaTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SumaNumerosBufferedReader {
    public static void main(String[] args) {
        FileReader in;
        double suma=0.0;

        try(BufferedReader br = new BufferedReader(new FileReader("notas.txt"))){

            String caracter;
            do{
                caracter = br.readLine();
                if(caracter != null){
                    suma += Double.parseDouble(caracter);
                }
            }
            while(caracter != null);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(suma);

    }
}
