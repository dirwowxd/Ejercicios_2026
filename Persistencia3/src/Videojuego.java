public class Videojuego {
    private String nombre;
    private double precio;
    private boolean multijugador;

    public Videojuego(String nombre, double precio, boolean multijugador) {
        this.nombre = nombre;
        this.precio = precio;
        this.multijugador = multijugador;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public boolean isMultijugador() { return multijugador; }

    // Ya te dejé el formato listo para escribir en el archivo
    public String formatoArchivo() {
        return nombre + ";" + precio + ";" + multijugador;
    }

    @Override
    public String toString() {
        return "Juego: " + nombre + " | $" + precio + " | Multijugador: " + (multijugador ? "Sí" : "No");
    }
}
