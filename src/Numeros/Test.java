package Numeros;

public class Test {
    public static void main(String[] args) {
        Numero numeros = new Numero();

        numeros.ingresarNumeros(6);
        numeros.ingresarNumeros(2);
        numeros.ingresarNumeros(0);
        numeros.ingresarNumeros(8);

        numeros.mostrarNumeros();
        System.out.println();

        numeros.ordenarNumeros();

        System.out.println();

        numeros.mostrarNumeros();

        System.out.println();

        numeros.ordenarDescendientes();

        numeros.mostrarNumeros();

    }
}
