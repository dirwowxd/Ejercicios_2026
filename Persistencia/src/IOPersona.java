import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class IOPersona {
    private static IOPersona instance;

    private IOPersona() {
    }

    public static IOPersona getInstance() {
        if (instance == null) {
            instance = new IOPersona();
        }
        return instance;
    }
    public Persona[] readPersonas() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("personas.txt"));
       ArrayList<Persona> personas = new ArrayList<>();
       String nombre;
       String direccion;
       LocalDate fechaNacimiento;
       EstadoCivil estado;
       float estatura;
        sc.useDelimiter("\\r?\\n|;\\s*");
       sc.useLocale(Locale.UK);
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       while (sc.hasNext()) {
             nombre = sc.next();
            direccion = sc.next();
            fechaNacimiento= LocalDate.parse(sc.next(), dtf);
            estado = EstadoCivil.valueOf(sc.next());
            estatura = Float.parseFloat(sc.next());
            personas.add(new Persona(nombre, direccion, fechaNacimiento, estado, estatura));
       }
        sc.close();
        return personas.toArray(new Persona[0]);
    }
    public void savePersonas (Persona[] personas) throws FileNotFoundException{
        PrintStream pw = new PrintStream(new File("personas.txt"));
        for (Persona p : personas) {
            pw.println(p.toString());

        }
        pw.close();

    }
}
