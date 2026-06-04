import java.io.*;
import java.util.ArrayList;

public class GestorLog {

    public void registrarEvento(String tipo, String mensaje){
        String linea = "[ " + tipo + " " + mensaje + " ]";
        try (FileWriter fw= new FileWriter("server.txt",true);
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(linea);
            bw.newLine();
            System.out.println("Archivo registrado exitosamente");
        } catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }

    }
    public void leerErrores () {
        File file = new File("server.txt");
        if (!file.exists()) {
            System.out.println("El archivo no existe");
            return;
        }
        ArrayList<String> errores = new ArrayList<>();
        try (FileReader fr = new FileReader("server.txt");
        BufferedReader br = new BufferedReader(fr)) {
            String linea;
          while ((linea = br.readLine()) !=null){
                if (linea.contains("ERROR")) {
                    errores.add(linea);
                }
            }

        } catch (IOException e){
            System.out.println("Error : "+e.getMessage());
            return;
        }

    }
    public void exportarErrores () {
        File file = new File("server.txt");
    }

}
