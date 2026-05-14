import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
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

        while (sc.hasNextLine() && procesadas < nro) {
            String line=sc.nextLine();
            String[] lineSplit = line.split("-");
           if(lineSplit.length>=4) {
               int nroRecetas= Integer.parseInt(lineSplit[0]);
               LocalDate fecha= LocalDate.parse(lineSplit[1], formatter);
               String paciente= lineSplit[2];
               RecetaMedica recetaMedica= new RecetaMedica(nroRecetas, paciente, fecha);
               for (int i = 3; i <= nroRecetas; i++) {
                   String medicamento= lineSplit[i].trim();
                   if (!recetaMedica.addNombreMedicamento(medicamento)) {
                       noIncluidas++;

                   }
               }
               mish.add(recetaMedica);
               procesadas++;
           }
        }

        return mish;
    }



}
