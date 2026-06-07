import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class IOGremio {

    public void registrarCaceria(String cazador, TipoArma arma, TipoObjetivo objetivo, LocalTime horaInicio, LocalTime horaFin) {
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter horaFormat = DateTimeFormatter.ofPattern("HH:mm");
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter fechaFormat = DateTimeFormatter.ofPattern("dd_MM_yyyy");
        String cazeriaArchivo= "Registro_Cacerias_"+fechaActual.format(fechaFormat) +".txt";

        try (FileWriter fw = new FileWriter(cazeriaArchivo,true);
        BufferedWriter bw = new BufferedWriter(fw)) {

            Duration duracion = Duration.between(horaInicio, horaFin);
            long duracionHoras = duracion.toHours();
            long duracionMinutosTotales = duracion.toMinutes();
            long duracionMinutosRestantes = duracion.toMinutesPart();

            String linea = "Cazador: [" + cazador + "]" + "| Arma: [" + arma.toString() + "]" + "| Objetivo: [" + objetivo.toString() + "]" + "Tiempo total: [" + duracionHoras + "h" + duracionMinutosRestantes + "m]";
            if (duracionMinutosTotales < 15) {
                linea += "Rango = Speedrun";
            }
            if (duracionMinutosTotales > 45 ){
                linea += "Rango = Superviviente";
            }
            bw.write(linea);
            bw.newLine();
            System.out.println("Cazeria registrado correctamente");

        } catch (IOException e){
            System.out.println("Error : "+ e.getMessage());
        }
        }
        public void leerCaceria(){
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter fechaFormat = DateTimeFormatter.ofPattern("dd_MM_yyyy");
        String cazeriaArchivo= "Registro_Cacerias_"+fechaActual.format(fechaFormat)+".txt";
        File file = new File(cazeriaArchivo);

        if (!file.exists()){
            System.out.println("El caceria no existe");
            return;
        }
        if ((file.length()==0)){
            System.out.println("No existen cacerias aun.");
            return;
        }
        try (FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            String linea;
            System.out.println("Registro Cacerias");
            while ((linea = br.readLine()) != null){
                System.out.println(linea);

            }


        } catch (IOException e){
            System.out.println("Error : "+ e.getMessage());
        }
        }
}
