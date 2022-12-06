package Ejercicios_Clases;

public class Numeros_Aleatorios {
    public static void main(String[] args) {
        int c = 5;
        int min = 2;
        int max = 20;
        nAleatorios(c,min,max);
        nAleatorios(2);

        int[] arreglo = {3,7,2,20,6,8,15};

        System.out.println("Valor maximo en arrays: "+ maximo(arreglo));

    }

    public static void nAleatorios(int c, int min, int max){

        for (int i = 0; i < c; i++) {
            int a = (int)(Math.random()*(max-min+1)+min);
            System.out.println("aleatorio entre 5 y 2 = " + a);
        }
    }

    public static void nAleatorios(int c){

        for (int i = 0; i < c; i++) {
            double a = (Math.random()*(1));
            System.out.printf("aleatorio entre 0 y 1  %.2f%n" , a);
        }
    }

    public static int maximo(int [] a){
        int r = 0;

        for (int valor: a) {
            if(valor > r){
                r = valor;
            }
        }
        return r;
    }
}
