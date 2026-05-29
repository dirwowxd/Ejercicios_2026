import java.io.File;
import java.io.FileNotFoundException;

public class DemoArchivo {
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("archivo.txt");
        try {
            if (!archivo.exists()) {
                System.out.println("El archivo no existe");
            }
            if (archivo.exists()) {
                System.out.println(archivo.getName());
                if (archivo.canRead()) {
                    System.out.println("Se puede leer");
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
