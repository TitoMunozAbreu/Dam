package Sistema_TareasPendientes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TareasPendientes {
    ArrayList<Tarea> tareas;

    public TareasPendientes(){
        this.tareas = new ArrayList<>();
    }

    public void agragarTarea(String description){
        tareas.add(new Tarea(description));
        System.out.println("\n new Tarea added");
    }

    public void eliminarTarea(int id){
        Iterator<Tarea> ite = tareas.iterator();

        while (ite.hasNext()){
            Tarea t = ite.next();

            if(t.getId() == id){
                ite.remove();
                System.out.println("\n Tarea removed succesfully");
                break;
            }else{
                System.out.println("\n id: " + id  + "does not exist in Tarea");
            }

        }
    }

    public Tarea buscarTarea(String description){
        Iterator<Tarea> ite = tareas.iterator();
        Tarea t = null;

        while (ite.hasNext()){
            t = ite.next();
            if(t.getDesciption().equals(description)){
                break;
            }else {
                t = null;
                System.out.println("\n Tarea does not exist");
            }
        }

        return t;
    }

    public Tarea buscarTarea(int id){
        Iterator<Tarea> ite = tareas.iterator();
        Tarea t = null;

        while (ite.hasNext()){
           t = ite.next();
            if(t.getId() == id){
                break;
            }else {
                t = null;
                System.out.println("\n Tarea does not exist");
            }
        }

        return t;
    }

    public void ordenaTareasbyID(){
        Collections.reverse(tareas);
    }




}
