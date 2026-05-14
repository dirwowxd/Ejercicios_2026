import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pedor Juarez", "Los romeros 1949", LocalDate.of(2006 ,1, 12), EstadoCivil.CASADO, 2.00f));
        personas.add(new Persona("Alexander jerez", "waskeros 777", LocalDate.of(2009, 7, 27), EstadoCivil.SOLTERO, 1.72f));
        personas.add(new Persona("Martin Valenzuela", "mish mishers", LocalDate.of(2006, 12, 23), EstadoCivil.VIUDO, 1.82f));

        try{
            IOPersona.getInstance().savePersonas(personas.toArray(new Persona[0]));
            Persona[] personas1=IOPersona.getInstance().readPersonas();
            System.out.println("Datos leidos");
            for(Persona p : personas1){
                System.out.println(p.toString()+ " Su edad es -> "+ p.getEdad() );
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Error men"+e);
        }
    }
}
