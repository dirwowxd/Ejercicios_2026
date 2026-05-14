import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Videojuego> misJuegos = new ArrayList<>();
        misJuegos.add(new Videojuego("Monster Hunter Wilds", 69.99, true));
        misJuegos.add(new Videojuego("GTA", 29.99, true));
        misJuegos.add(new Videojuego("Minecraft", 19.99, true));

        try {
            // 1. Llama a tu método para guardar
            System.out.println("Guardando juegos en el archivo...");
            IOVideojuego.getInstance().guardarJuegos(misJuegos, "juegos.txt");

            // 2. Llama a tu método para leer
            System.out.println("Leyendo juegos desde el archivo...");
            ArrayList<Videojuego> juegosLeidos = IOVideojuego.getInstance().leerJuegos("juegos.txt");

            // 3. Muestra el resultado
            System.out.println("\n--- RESULTADO DE LA LECTURA ---");
            for (Videojuego v : juegosLeidos) {
                System.out.println(v.toString());
            }

        } catch (Exception e) {
            System.err.println("Error fatal: " + e.getMessage());
        }
    }
}
