package Ejercicio_Exceptions;

public class TestProducto {
    public static void main(String[] args) {
        Producto cerveza = new Producto("Polar", 1.75, 5);

        cerveza.agregarAlCarrito(4);
    }
}
