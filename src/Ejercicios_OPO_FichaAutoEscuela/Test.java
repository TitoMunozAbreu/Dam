package Ejercicios_OPO_FichaAutoEscuela;

public class Test {
    public static void main(String[] args) {
        Profesor p = new Profesor("Conchita e", "Mango", "1234X", 1350.85,"Papaya");
        Alumno a = new Alumno("Pepe", "Martin", "1235Y", 'B');
        Coche c = new Coche("456-XMS", "seat", "ibiza");
        Ficha f = new Ficha();

        f.addProfesor(p);
        f.addAlumno(a);
        f.addCoche(c);

        System.out.println(f);

    }
}
