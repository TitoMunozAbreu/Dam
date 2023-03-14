package Control_Inventario;

public class Test {
    public static void main(String[] args) {
        Inventario almacen = new Inventario();

        almacen.agregarProducto("Laptop", 3);
        almacen.agregarProducto("Mobile", 2);
        almacen.agregarProducto("Scooter", 5);
        almacen.agregarProducto("Ebike", 8);

        almacen.mostrarInventario();

        almacen.eliminarProducto("Laptop");

        almacen.actualizarProducto("Laptop", 5);
        almacen.actualizarProducto("Scooter", 10);

        almacen.mostrarInventario();


    }
}
