package Control_Inventario;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Inventario {
    Map<String,Integer> products;

    public Inventario(){
        this.products = new HashMap<>();
    }

    public void agregarProducto(String name, int quantity){
        boolean equals = products.containsKey(name);
        if(!equals){
            products.put(name,quantity);
            System.out.println("\n Product added succesfully.");
        }else {
            System.out.println("\n Can't be added the product.");
        }
    }

    public void eliminarProducto(String name){
        boolean equals = products.containsKey(name);
        if(equals){
            this.products.remove(name);
            System.out.println("\n Product removed succesfully.");
        }else {
            System.out.println("\n Can't be added the product.");
        }

    }

    public void buscarProducto(String name){
        this.products.get(name);
    }

    public void actualizarProducto(String name, int quantity){
        if(products.containsKey(name)){
            this.products.replace(name, products.get(name), products.replace(name,quantity));
            System.out.println("\n Product updated succesfully");
        }else {
            System.out.println("\n Product does not exist");
        }

    }

    public void mostrarInventario(){
        System.out.println("\n ** INVENTARIO **");

        products.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }


}
