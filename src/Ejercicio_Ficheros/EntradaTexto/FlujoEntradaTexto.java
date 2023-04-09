package Ejercicio_Ficheros.EntradaTexto;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FlujoEntradaTexto {
    public static void main(String[] args) {
        FileReader in = null;
        int notasTrimI = 0;

        try {
            in = new FileReader("notas.txt");

            int lectura = in.read();

            while (lectura != -1){
                notasTrimI += (char) lectura;
                lectura = in.read();
            }

            in.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(notasTrimI);

    }
}
