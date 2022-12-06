package Ejercicios_Clases;

public class Busqueda_Arrays {
    public static void main(String[] args) {
        int [] arreglo = {10,6,9,30,7};
        int clave = 9;


        System.out.println("El numero clave se encuentra en el indice: " + buscar(arreglo, clave));
    }

    public static int buscar(int[] a, int c){
        int r = 0;

        for(int i = 0 ;i < a.length; i++){
            if(a[i] == c){
                r = i;
                break;
            }else{
                r = -1;
            }
        }

        return r;
    }
}
