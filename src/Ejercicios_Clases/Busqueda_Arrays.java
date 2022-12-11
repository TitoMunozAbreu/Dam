package Ejercicios_Clases;

public class Busqueda_Arrays {
    public static void main(String[] args) {
        //inicializamos el arreglo
        int [] arreglo = {10,6,9,30,7};
        //inicializamos la clave a buscar en el arreglo
        int clave = 9;

        //mostrar la posicion de la clave encontrada
        System.out.println(buscar(arreglo, clave));
    }

    /**
     * BUSQUEDA DE UN ELEMENTO EN UN ARRAY
     * @param a Le pasamos el array
     * @param c Elemento a buscar en el array
     * @return Devuelve la posicion del elemento encontrado
     */
    public static int buscar(int[] a, int c){
        //variable para guardar el resultado
        int r = 0;

        for(int i = 0 ;i < a.length; i++){
            //comprobar si el arreglo en la posicion i es igual al elemento
            if(a[i] == c){
                r = i; //almacenar el valor en resultado
                System.out.print("El numero clave se encuentra en el indice: ");
                break;
            }else{//en caso de no encotrar el elemento delvovera -1
                r = -1;
            }
        }
        //comprobar que r no haya encontrado el elemento
        if(r == -1){
            System.out.println("No existe el numero clave en la tabla arreglo");
        }
            return r;
    }

}
