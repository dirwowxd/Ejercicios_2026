import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class IOVideojuego {
    private static IOVideojuego instance;
    private IOVideojuego() {}
    public static IOVideojuego getInstance() {
        if (instance == null) {
            instance= new IOVideojuego();
        }
        return instance;
    }
    public void guardarJuegos(ArrayList<Videojuego> lista, String nombreArchivo) throws FileNotFoundException {
        Scanner mish= new Scanner(new File("juegos.txt"));

    }
}
