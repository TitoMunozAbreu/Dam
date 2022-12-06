package Ejercicios_Clases;

public class Numeros_Divisores_amigos {
    public static void main(String[] args) {
        int a = 220;
        int b = 284;

        System.out.println("Son  amigos? " + sonAmigos(a,b));
    }

    private static boolean sonAmigos(int a, int b) {
        boolean r;
        int mayor = Math.max(a, b);
        int s1 = 0;
        int s2 = 0;

        for (int i = 1; i <= mayor; i++) {
            if (a % i == 0) {
                s1 += i;
            }
            if(b%i == 0){
                s2 += i;
            }
        }
        System.out.println("Suma Divisores de a: " + s1);
        System.out.println("Suma Divisores de b: " + s2);

        r = s1 == s2;

        return r;
    }
}
