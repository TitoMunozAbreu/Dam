package Ficha_AutoEscuela;

public class Test {
    public static void main(String[] args) {
        Profesor p = new Profesor("Conchita e", "Mango", "1234X", 1350.85,"Papaya");
        Alumno a = new Alumno("Pepe", "Martin", "1235Y", 'B');
        Coche c = new Coche("456-XMS", "seat", "ibiza");

        Profesor p1 = new Profesor("Platano", "Melon", "6589X", 1050.50,"Papaya");
        Alumno a1 = new Alumno("Pitaya", "Moraa", "5515Y", 'B');
        Coche c1 = new Coche("697-DFE", "ford", "fiesta");

        Ficha f = new Ficha();

        f.addProfesor(p);
        f.addAlumno(a);
        f.addCoche(c);

        f.addProfesor(p1);
        f.addAlumno(a1);
        f.addCoche(c1);

        System.out.println(f);

        f.addProfesor(p1);



    }
}
