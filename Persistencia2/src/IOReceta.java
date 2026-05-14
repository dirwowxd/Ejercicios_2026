import java.io.File;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class IOReceta {
    private static IOReceta instance;
    private IOReceta() {

    }
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static IOReceta getInstance() {
        if (instance == null) {
            instance = new IOReceta();
        }
        return instance;
    }
    public ArrayList<RecetaMedica> readPersonas() throws FileNotFoundException {
        ArrayList<RecetaMedica> mish  = new ArrayList<>();
        File file = new File("receta.txt");
        Scanner sc = new Scanner(file);
        int nro=Integer.parseInt(sc.nextLine());
        int procesadas= 0;
        int noIncluidas=0;

        while (sc.hasNextLine()) {

        }

    }



}
