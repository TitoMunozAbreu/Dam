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
        //inicializar el numero
        int n = 10;
        //incializar la potencia
        int p = 10;
        //inicializar array
        int[] arreglo = {5, 8, 6, 1, 25, 7, 16};
        //incializar indice
        int i = 0;
         //incializar elemento
        int elemento = 10;
        int[][] matriz = {  {5, 8, 6, 1, 25, 7, 16},
                            {3, 5, 10, 15, 10,16, 2}
                        };
        //inicializar indice de la columna
        int j = 0;

        //mostrar metodo factorial
        System.out.println("Calcular Factorial de "+ n + ": " + factorial(n));

        //mostar metodo potencia
        System.out.println("Potencia de " + n + "^" + p + ": "+ potencia(n, p));

        //mostar metodo suma
        System.out.println("La suma de 1 hasta " + n + ": " + suma(n));

        //mostar metodo fibonacci
        System.out.println(fibonacci(n));

        //mostrar array
        mostrarArray(arreglo, i);

        //mostrar elemento de un array
        System.out.println("Buscar elemento "+ elemento + " en array: " + buscarElemento(arreglo, i, elemento));

        //mostrar matriz
        mostrarMatriz(matriz, i, j);

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
        int resultado;
        //CASO BASE, si es cero devuelve un cero
        if (n == 0) {
            resultado = 0;
            //CASO BASE, si es 1 devuelve un 1
        } else if (n == 1) {
            resultado = 1;
        } else {
            //Hago la suma
            resultado = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return resultado;
    }

    /**
     * MOSTAR ARRAY
     * @param arreglo Le pasamos el array a mostar
     * @param i Le pasamos a partir de que indice mostrara el arreglo
     */
    public static void mostrarArray(int[] arreglo, int i){
            if(i > arreglo.length-1){ //comprueba que el i sea menor que la longitud del arreglo
                System.out.println("El indice introducido es mayor a la longitud de la array");
            }else if(arreglo.length-1 == i){ // caso base: cuando el indice del array sea igual al indice introducido
                System.out.println(arreglo[i]);
            }else{ // caso recursivo
                System.out.println(arreglo[i]);
                mostrarArray(arreglo, i + 1);
            }
    }

    /**
     * BUSCAR ELEMENTO EN UN ARRAY
     * @param arreglo Le pasamos el array a buscar
     * @param i Pasar a partir de que posicion se quiere buscar el elemento
     * @param elemento El numero a buscar en el array
     * @return Devuelve el elemento encontrado
     */
    public static int buscarElemento(int[] arreglo,int i,int elemento){
        int resultado;

        if(arreglo[i] == elemento){ // caso base: cuando el valor de arreglo en la posicion de i sea igual a elemento
            resultado = arreglo[i];
        }else if(arreglo[i] != elemento){
            System.out.println("Elemento no encontrado");
            resultado = -1;
        }else{ //llamada recursiva
                 resultado = buscarElemento(arreglo,i+1, elemento);
        }
        return resultado;
    }

    /**
     * MOSTRAR UNA MATRIZ
     * @param matriz Le pasamos la matriz
     * @param i Posicion de la fila a mostrar
     * @param j Posicion de la columna a mostrar
     */
    public static void mostrarMatriz(int[][] matriz, int i, int j){

        System.out.print(matriz[i][j] + ",");

        if(i != matriz.length-1 || j != matriz[i].length-1){ //comprobar si tanto i como j son diferentes a la longitud del array
            if(j == matriz[i].length-1){ //comprobar si j es igual a la longitud del array[i]
                i++; // paso a la siguiente fila
                j = 0; //reiniciar j a cero
                System.out.println(" "); //salto de linea
            }else{
                j++; //paso a la siguiente columna
            }
            mostrarMatriz(matriz, i, j);
        }

        /* MOSTRAR MATRIZ CON ITERACION
        for (int k = 0; k < arreglo.length; k++) {
            System.out.print("{");
            for (int l = 0; l < arreglo[i].length; l++) {
                System.out.print((arreglo[k][l]) + " ");
            }
            System.out.println("}");
        }
         */

    }






}
