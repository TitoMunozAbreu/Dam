package Ejercicios_Conjunto;

public class Test {
    public static void main(String[] args) {
        Conjunto pruebaUno = new Conjunto();
        Conjunto pruebaDos = new Conjunto();

        pruebaUno.lista.add(0);
        pruebaUno.lista.add(1);
        pruebaUno.lista.add(2);
        System.out.println("PruebaUno Lista: " + pruebaUno.lista);

        pruebaDos.lista.add(10);
        pruebaDos.lista.add(11);
        pruebaDos.lista.add(12);
        System.out.println("PruebaDos Lista: " + pruebaDos.lista);

        pruebaUno.conjunto.add(new Conjunto());
        pruebaUno.conjunto.add(new Conjunto());
        pruebaUno.conjunto.add(new Conjunto());
        System.out.println("PruebaUno Conjunto: " + pruebaUno.conjunto.size());

        pruebaDos.conjunto.add(new Conjunto());
        pruebaDos.conjunto.add(new Conjunto());
        pruebaDos.conjunto.add(new Conjunto());
        System.out.println("PruebaDos Conjunto: " + pruebaDos.conjunto.size());

        System.out.println(pruebaUno.numeroElementos());

    }
}
