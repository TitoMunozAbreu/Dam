package Ejercicios_OPO_FichaAutoEscuela;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Ficha {
    private Profesor[] profesores;
    private Alumno[] alumnos;
    private Coche[] coches;

    public Ficha(){
        this.profesores = new Profesor[1];
        this.alumnos = new Alumno[1];
        this.coches = new Coche[1];
    }

    public void addProfesor (Profesor p){
        for (int i = 0; i < profesores.length; i++) {
            profesores[i] = p;
        }
        System.out.println("Profesor agregado al fichero exitosamente");
        System.out.println();
    }

    public void addAlumno (Alumno a){
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = a;
        }
        System.out.println("Alumno agregado al fichero exitosamente");
        System.out.println();
    }

    public void addCoche (Coche c){
        for (int i = 0; i < coches.length; i++) {
            coches[i] = c;
        }
        System.out.println("Coche agregado al fichero exitosamente");
        System.out.println();
    }

    public void getProfesor(String dni){
        for (int i = 0; i < profesores.length; i++) {
            if(profesores[i].getDNI().equals(dni)){
                System.out.println(profesores[i].toString());
            }
        }
    }

    public void getAlumno(String dni){
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].getDNI().equals(dni)){
                System.out.println(alumnos[i].toString());
            }
        }
    }

    public void getcoche(String m){
        for (int i = 0; i < coches.length; i++) {
            if(coches[i].getMatricula().equals(m)){
                System.out.println(coches[i].toString());
            }
        }
    }

    @Override
    public String toString() {
        return "** FICHA PROFESORES ** " + "\n"+
                Arrays.toString(profesores) + "\n"+
                "** FICHA ALUMNOS ** " + "\n"+
                Arrays.toString(alumnos) + "\n"+
                "** FICHA COCHES ** " + "\n"+
                Arrays.toString(coches);
    }
}
