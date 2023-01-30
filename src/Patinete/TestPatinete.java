package Patinete;

import java.time.LocalDate;

public class TestPatinete {

    public static void main(String[] args) {
        Patinete p1 = new Patinete("1234","city","xiomi",Colores.GRIS,"2000");
        Cliente c1 = new Cliente("1234567Y", "Papaya", "Conchita", "Av. Che guevara","638745659");
        Tecnico t1 = new Tecnico("7653958D", "Mango", "Con Sal", LocalDate.of(2021,3,21), 18500);
        FichaTecnicaPatinete ft = new FichaTecnicaPatinete(c1,t1);

        System.out.println(p1);
        System.out.println(c1);
        System.out.println(t1);
        System.out.println(ft);



        c1.comprarPatinete(LocalDate.now(),p1);






    }
}
