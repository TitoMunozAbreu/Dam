package Empleado;

public class Test {
    public static void main(String[] args) {
        Empleado operario1 = new Operario("Maria");
        Operario operario2 = new Operario("Jesica");
        Tecnico operario3 = new Tecnico("Alba");
        Directivo operario4 = new Directivo("Sofia");
        Oficial operario5 = new Oficial("Lola");


        System.out.println(operario1.getNombre() + ": " + operario1.getClass());
        System.out.println(operario2.getNombre() + ": " + operario2.getClass());
        System.out.println(operario3.getNombre() + ": " + operario3.getClass());
        System.out.println(operario4.getNombre() + ": " + operario4.getClass());
        System.out.println(operario5.getNombre() + ": " + operario5.getClass());

        if(operario1.equals(operario2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }
}
