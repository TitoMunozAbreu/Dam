package Ejercicio_Ficheros.EntradaTexto;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SumarNumerosScanner {
    public static void main(String[] args) {
        //Declarar variables
        FileReader in;
        Scanner sc;
        double suma = 0;

        try{
            //inicializar y epecificar nombre del arvicho
            in = new FileReader("notas.txt");
            //delegar a scanner la lectura del archivo
            sc = new Scanner(in);

            //Lectura del archivo mientras contega datos
            while (sc.hasNext()){
                //alamcenar los ddatos en una varible
                suma += Double.parseDouble(sc.next());

            }
            //cerramos el archivo
            sc.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //mostar suma de datos
        System.out.println(suma);
    }
}
