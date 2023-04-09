package Ejercicio_Exceptions;

import java.text.NumberFormat;

public class Producto {
    private String nombre;
    private double precio;
    private int cantDisponible;

    public Producto(String nombre, double precio, int cantDisponible){
        this.nombre = nombre;
        this.precio = precio;
        this.cantDisponible = cantDisponible;
    }

    public void agregarAlCarrito(int cantidad){
        double totalCompra = 0;
        try {
            if(cantidad <= cantDisponible){
                totalCompra = cantidad * precio;
                setCantDisponible(cantDisponible-cantidad);
                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                String moneyString = formatter.format(totalCompra);
                System.out.print("Total compra = " + moneyString);
            }else {
                    throw new ProductoNoDisponibleExcepction();
            }
        } catch (ProductoNoDisponibleExcepction e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    @Override
    public String toString() {
        return "\n Producto" + "\n" +
                "nombre = " + nombre + "\n" +
                "precio = " + precio + "\n" +
                "cantDisponible = " + cantDisponible + "\n";
    }
}
