package Ejercicio_Ficheros.SalidaTexto;

import java.io.*;

public class GuardarTexto {
    public static void main(String[] args) {

        escribirFichero();

        System.out.println(leerFichero("poema.txt"));
    }
    public static void escribirFichero(){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("poema.txt"))){

            bw.write("En un lugar de La Mancha,");
            bw.newLine();
            bw.write("de cuyo nombre no quiero acordarme.");

            System.out.println("Texto escrito en el fichero \n");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static String leerFichero(String url){
        String ch;
        String textoFichero = "";
        FileReader in;

        try(BufferedReader br = new BufferedReader(new FileReader(url))){

            do{
                ch = br.readLine();
                if(ch != null){
                    textoFichero += ch + "\n";
                }

            }while (ch != null);

        }catch (IOException e){
            e.printStackTrace();
        }

        return textoFichero;
    }


}

