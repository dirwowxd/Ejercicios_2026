import java.io.*;
import java.util.ArrayList;

public class GestorDeBuilds {

    public void registrarBuild(String arma, String armadura) {
        String linea= "[ Arma "+arma+" ] [ Armadura "+armadura+" ]";
        try (FileWriter fw= new FileWriter("builds.txt", true);
        BufferedWriter bw= new BufferedWriter(fw)){
            bw.write(linea);
            bw.newLine();
            System.out.println("Build guardado exitosamente");

        } catch (IOException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
    public void mostrarBuilds(String armaBuscada) {
        ArrayList<String> listaBuilds = new ArrayList<>();
        File file = new File("builds.txt");
        if (!file.exists()) {
            System.out.println("No se encontro el archivo");
            return;
        }
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)){
            String linea;

            while ((linea = br.readLine()) != null) {
                listaBuilds.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error : "+e.getMessage());
        }
        System.out.println("Resultados para arma buscada : "+ armaBuscada);
        boolean setEncontrado = false;
        for (String build : listaBuilds) {
            if (build.contains(armaBuscada)) {
                System.out.println(build);
                setEncontrado = true;
            }
        }
        if (!setEncontrado) {
            System.out.println("No se encontro el set");
        }
    }
}
