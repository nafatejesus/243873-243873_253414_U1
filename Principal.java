public class Principal {
    private GestorProductos gestor;

    public Principal() {
        gestor = new GestorProductos();
    }

    public static void main(String[] args) {
        Principal app = new Principal();

        // Registrar productos
        app.gestor.registrarProducto("Laptop", 101);
        app.gestor.registrarProducto("Mouse", 102);
        app.gestor.registrarProducto("Teclado", 103);

        // Visualizar productos
        app.gestor.visualizarProductos();

        // Buscar producto por ID
        app.gestor.buscarProductos(102);
    }
}
