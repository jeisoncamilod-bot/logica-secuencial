public class Producto {

    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return precio * cantidad;
    }

    public void mostrarInformacion() {
        System.out.println(
                nombre + 
                " - $" + precio +
                " - Cantidad: " + cantidad +
                " - Subtotal: $" + calcularSubtotal()
        );
    }
}
