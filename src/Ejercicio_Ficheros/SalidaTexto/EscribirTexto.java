package Ejercicio_Ficheros.SalidaTexto;

import java.io.*;

public class EscribirTexto {
    public static void main(String[] args) {

        escribirTextoEnFichero("Informe.txt");
        leerFichero("Informe.txt");
    }

    public static void escribirTextoEnFichero(String url){
        boolean trueFalse = true;
        FileWriter out;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe las memorias Dual:");

        do{
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(url, true))){

                String caracteres = br.readLine();

                if (caracteres.equalsIgnoreCase("fin")){
                    trueFalse = false;
                    System.out.println("sesion finalizada \n");
                }else {
                    if(caracteres.equalsIgnoreCase("")){
                        bw.newLine();
                    }else{
                        bw.write(caracteres);
                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }while (trueFalse);


    }

    public static void leerFichero(String url){

        String caracteres;
        try(BufferedReader br = new BufferedReader(new FileReader(url))){

            do {
                caracteres = br.readLine();

                if(caracteres != null){
                    System.out.println(caracteres);
                }

            }while (caracteres != null);

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
