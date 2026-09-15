public class Producto {
    private String nombre;
    private int id;

    // Constructor
    public Producto(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Método para mostrar información del producto
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre);
    }
}
