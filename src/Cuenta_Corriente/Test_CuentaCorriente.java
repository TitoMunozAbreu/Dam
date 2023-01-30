package Cuenta_Corriente;

public class Test_CuentaCorriente {
    public static void main(String[] args) {
        CuentaCorriente prueba = new CuentaCorriente("Y7633060D", "Conchita e Mango");

        System.out.println(prueba.toString());
        System.out.println();

        prueba.sacarDinero(500);
        System.out.println();

        prueba.ingresarDinero(500);
        System.out.println();

        prueba.sacarDinero(500);



    }

}
