package Control_Inventario;

import java.util.Comparator;

public class Product implements Comparable<Product>{
    private String name;
    private int quantity;

    public Product(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "name = " + this.getName() + "\n" +
                "quantity = " + this.getQuantity() + "\n";
    }

    @Override
    public int compareTo(Product o) {
        return  this.getName().compareTo(o.getName());
    }

}



