import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
    public ArrayList<RecetaMedica> readRecetas() throws FileNotFoundException {
        ArrayList<RecetaMedica> mish  = new ArrayList<>();
        File file = new File("recetas.txt");
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
               for (int i = 3; i <= lineSplit.length; i++) {
                   String medicamento= lineSplit[i].trim();
                   if (!recetaMedica.addNombreMedicamento(medicamento)) {
                       noIncluidas++;

                   }
               }
               mish.add(recetaMedica);
               procesadas++;
               sc.close();
           }
        }
        System.out.println("Numero de medicamentos repetidos y no incluidos: " + noIncluidas);
        return mish;
    }

    public void writeRecetas(ArrayList<RecetaMedica> recetas) throws FileNotFoundException {
        File file = new File("informe.txt");
        Scanner sc = new Scanner(file);
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("RECETAS DEL AÑO 2022 QUE INCLUYEN MENTIX");
            writer.printf("%-11s%-26s%n", "Nro Receta", "Nombre paciente");
            int totalMentix=0;
            for (RecetaMedica recetaMedica : recetas) {
                writer.println(recetaMedica.toString());
            }
        }
    }




}
