package Ejercicios_FichaAutoEscuela;

import java.util.Arrays;

public class Ficha {
    private Profesor[] profesores;
    private Alumno[] alumnos;
    private Coche[] coches;

    int contador_p = 0;
    int contador_a = 0;
    int contador_c = 0;
    int n = 2;

    public Ficha(){
        this.profesores = new Profesor[n];
        this.alumnos = new Alumno[n];
        this.coches = new Coche[n];
    }

    public void addProfesor (Profesor p){
        if(contador_p < n){
            for (int i = contador_p; i < profesores.length;) {
                profesores[i] = p;
                contador_p++;
                System.out.println((i+1) + ": Profesor agregado al fichero exitosamente");
                break;
            }
        }else{
            System.out.println("NO es posible contratar mas profesores");
        }
        System.out.println();
    }

    public void addAlumno (Alumno a){
        if(contador_a < n) {
            for (int i = contador_a; i < alumnos.length; i++) {
                alumnos[i] = a;
                contador_a++;
                System.out.println((i+1) + ":Alumno agregado al fichero exitosamente");
                break;
            }
        }else{
            System.out.println("NO es posible contratar mas alumnos");
        }
        System.out.println();
    }

    public void addCoche (Coche c){
        if(contador_c < n) {
            for (int i = contador_c; i < coches.length;) {
            coches[i] = c;
            contador_c++;
            System.out.println((i+1) + ":Coche agregado al fichero exitosamente");
            break;
            }
        }else{
            System.out.println("NO es posible comprar mas coches");
        }

        System.out.println();
    }

    public void getProfesor(String dni){
        for (Profesor profesor : profesores) {
            if (profesor.getDNI().equals(dni)) {
                System.out.println(profesor.toString());
            }
            break;
        }
    }

    public void getAlumno(String dni){
        for (int i = 0; i < alumnos.length;) {
            if(alumnos[i].getDNI().equals(dni)){
                System.out.println(alumnos[i].toString());
            }
            break;
        }
    }

    public void getcoche(String m){
        for (int i = 0; i < coches.length;) {
            if(coches[i].getMatricula().equals(m)){
                System.out.println(coches[i].toString());
            }
            break;
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
