package Conjunto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Conjunto {
    ArrayList<Integer> lista = new ArrayList<>();
    List<Conjunto> conjunto = new ArrayList<>();


    //constructor sin parametros
    public Conjunto(){}

    //devuelve el numero de elementos del conjuto
    public int numeroElementos(){
        return lista.size();
    }

    //inserta un nuevo elemento en el conjunto
    public boolean insertar(Integer nuevo){
        lista.add(nuevo);

        return true;
    }

    //añade al conjunto los elementos del conjunto otroConjunto
    public boolean insertar(List<Conjunto> otroConjunto){
        conjunto.addAll(otroConjunto);
        return true;
    }

    //en caso de pertenecer al conjunto elimina elemento
    public boolean eliminarElemento(Integer elemento){
        boolean result = false;

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals(elemento)){
                lista.remove(i);
                result = true;
                System.out.println("Elemento eliminado");
            }else{
                System.out.println("Elemento no encontrado en la lista");
            }
        }

        return result;
    }

    //elimina del conjunto invocante los elementos del conjunto que se pasa como parametro
    public boolean eliminarConjunto(List<Conjunto> otroConjunto){
        boolean result = false;

        //Crear un Iterator para recorrer empleados
        Iterator<Conjunto> ite = conjunto.iterator();
        //Inicializar un objeto Conjunto
        Conjunto c;

        //recorrer el Iterator mientras encuentre informacion
        while (ite.hasNext()){
            //guardar en una variable el iterator next
            c = ite.next();
            //Recoremos el conjunto
            for (int i = 0; i < conjunto.size(); i++) {
                //comprobar que coincidan
                if(c.equals(otroConjunto.get(i))){
                    //Se elimina
                    ite.remove();
                    result = true;
                    System.out.println("Conjunto eliminado");
                    break;
                }
            }
        }

        return result;
    }

    /**
    //indica si el elemento que se le pasa como parametro pertenece o no al conjunto
    public boolean pertenece(Integer elemento){
        //Lo encuentro igual al metodo eliminar conjunto

    }*/

    //muestra el conjunto por consola
    public void muestra(){
        for(Conjunto c:conjunto){
            System.out.println(c);
        }
    }

    /**Añade a la clases Conjunto los siguientes metodos estaticos**/

    //devuelve true si c1 esta incluido en c2, es decir si todos los elementos de c1 estan tambien en c2
    public static boolean incluido(List<Conjunto> cUno, List<Conjunto> cDos){
        boolean result = false;
        for(Conjunto cTwo:cDos){
            for (Conjunto cOne:cUno){
                if(cTwo.equals(cOne)){
                    result = true;
                    break;
            }

            }
        }
        return result;
    }

    //devuelve un nuevo conjunto con todos los elementos que estan en c1,
    // en c2 o en ambos (elementos comunes y no comunes)
    public static List<Conjunto> union(List<Conjunto> cUno, List<Conjunto> cDos){
        List<Conjunto> union = new ArrayList<>();

        //recorrer el cUno
        union.addAll(cUno);
        //recorrer el cDos
        union.addAll(cDos);
        System.out.println("metodo union completado");
        return union;
    }

    //devuelve un nuevo conjunto con todos los elementos que estan en c1 y en c2 a la vez (elementos comunes)
    public static List<Conjunto> interseccion(List<Conjunto> cUno, List<Conjunto> cDos){
        List<Conjunto> interseccion = new ArrayList<>();

        for(Conjunto cOne:cUno){
            for (Conjunto cTwo:cDos){
                if(cOne.equals(cTwo)){
                    interseccion.add(cTwo);
                    System.out.println("metodo interseccion completado");
                }
            }
        }

        return interseccion;
    }

    //devuelve un nuevo conjunto con todos los elementos que estan en c1, pero no en c2
    public static List<Conjunto> diferencia(List<Conjunto> cUno, List<Conjunto> cDos){
        List<Conjunto> diferencia = new ArrayList<>();

        for(Conjunto cOne:cUno){
            for (Conjunto cTwo:cDos){
                if(!cOne.equals(cTwo)){
                    diferencia.add(cTwo);
                    System.out.println("metodo diferencia completado");
                }
            }
        }

        return diferencia;
    }



}



