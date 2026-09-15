import java.util.ArrayList;

public class GestorProductos {
    private ArrayList<Producto> productosExistentes;
    private Producto producto;

    // Constructor
    public GestorProductos() {
        productosExistentes = new ArrayList<>();
    }

    // Registrar un nuevo producto
    public void registrarProducto(String nombre, int id) {
        producto = new Producto(nombre, id);
        productosExistentes.add(producto);
        System.out.println("Producto registrado: " + nombre);
    }

    // Visualizar todos los productos
    public void visualizarProductos() {
        System.out.println("\nLista de productos:");
        for (Producto p : productosExistentes) {
            p.mostrarInfo();
        }
    }

    // Buscar producto por ID
    public Producto buscarProductos(int idProducto) {
        for (Producto p : productosExistentes) {
            if (p.getId() == idProducto) {
                System.out.println("Producto encontrado:");
                p.mostrarInfo();
                return p;
            }
        }
        System.out.println("Producto no encontrado.");
        return null;
    }
}

