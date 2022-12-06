package Ejercicios_Clases;

/**
 * Clase de Recursividad
 * aplicando mentodos recursivos
 * @author Tito Muñoz
 * @since 06/12/2022
 * @version 1
 */

public class Aplicando_Recursividad {
    public static void main(String[] args) {
        //inicializamos el numero
        int n = 10;
        //incializamos la potencia
        int p = 10;

        //mostrar metodo factorial
        System.out.println("Calcular Factorial de "+ n + ": " + factorial(n));

        //mostar metodo potencia
        System.out.println("Potencia de " + n + "^" + p + ": "+ potencia(n, p));

        //mostar metodo suma
        System.out.println("La suma de 1 hasta " + n + ": " + suma(n));

        //mostar metodo fibonacci
        System.out.println(fibonacci(n));
    }

    /**
     * CALCULAR FACTORIAL
     * @param f Le pasamos el numero a factorizar
     * @return Devuelve el resultado de la factorizacion
     */
    public static int factorial (int f){
        int resultado;
        if(f < 2){ // caso base
            resultado = 1;
        }else{ // aplicamos recursividad
            resultado = f * factorial(f-1);
        }
        return resultado;
    }

    /**
     * CALCULAR LA POTENCIA
     * @param b Numero base
     * @param p La veces que se multiplicara el numero base
     * @return Devuelve el resultado de la potencia
     */
    public static int potencia(int b, int p){
        int resultado;

        if(p < 1){ //caso base
            resultado = 1;
        }else { // caso recursivo
            resultado = b * potencia(b, p-1);
        }

        return  resultado;
    }

    /**
     * CALCULAR LA SUMA DE LOS NUMEROS NATURALES
     * @param n Indica hasta donde realizara la suma
     * @return Devuelve el resultado de la suma
     */
    public static int suma(int n){
        int resultado;

        if(n == 0){ //caso base
            resultado = 1;
        }else{ //caso recursivo
            resultado = n + suma(n-1);
        }
        return resultado;

    }

    public static int fibonacci(int n){
        //CASO BASE, si es cero devuelve un cero
        if (n == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }




}
