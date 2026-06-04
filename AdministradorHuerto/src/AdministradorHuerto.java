import java.io.*;

public class AdministradorHuerto {

    public void escribirArchivo(String tipoPlanta, int cantidad) throws IOException {
        String linea= "[tipo de planta] "+ tipoPlanta + " [cantidad] "+cantidad;

            try { FileWriter fw = new  FileWriter("cosechas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(linea);
            bw.newLine();
            bw.close();
            System.out.println("Archivo escribido correctamente");

        } catch(IOException e){
                System.out.println("Error : "+e.getMessage());
        }
    }
    public void mostrarArchivo() {
        File file = new File("cosechas.txt");
        if(!file.exists()){
            System.out.println("El archivo no existe");
            return;
        }
        System.out.println("Contenido del archivo cosechas");
        try
                (FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("El archivo no existe");
        }

    }
}
