package Ejercicio_Ficheros.SalidaTexto;

import java.io.*;

public class CopiarFichero {
    public static void main(String[] args) {

        copiarFichero("poema.txt");
        System.out.println(leerFichero("copia_de_poema.txt"));

    }
    public static String leerFichero(String url) {
        String textoFichero = "";
        String ch;

        try (BufferedReader br = new BufferedReader(new FileReader(url))) {
            do {
                ch = br.readLine();

                if (ch != null) {
                    textoFichero += ch + "\n";
                }
            } while (ch != null);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return textoFichero;
    }

    public static void copiarFichero(String url){
        String nombreArchivo = "copia_de_" + url;

        File txtFile = new File(nombreArchivo);

        try{
            if(!txtFile.exists()){
                txtFile.createNewFile();
                  BufferedWriter bw = new BufferedWriter(new FileWriter(txtFile));

                bw.write(leerFichero(url));
                bw.close();
            }else {
                System.out.println("El arhivo ya existe");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
