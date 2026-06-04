import java.io.*;
import java.util.ArrayList;

public class GestorAcceso {

    public void agregarJugador(String nombreJugador, String rango){
        String linea= "[ Nombre: "+nombreJugador+" | Rango: "+rango+"]";

        try (FileWriter fw = new FileWriter("whitelist.txt",true);
             BufferedWriter bw= new BufferedWriter(fw)){
                bw.write(linea);
                bw.newLine();
                bw.close();
            System.out.println("Archivo agregado correctamente");

             } catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }

    }
    public void cargarYMostrarJugadores(){
        File file = new File("whitelist.txt");
        if(!file.exists()){
            System.out.println("El archivo no existe");
            return;
        }
        ArrayList<String> listaJugadores = new ArrayList<>();
        try (FileReader fr = new FileReader("whitelist.txt");
             BufferedReader br= new BufferedReader(fr)){
            String linea;
            while ((linea =br.readLine())!= null){
                listaJugadores.add(linea);
            }
            System.out.println("Lista de jugadores :");
            for(String jugador : listaJugadores){
                System.out.println(jugador);
            }

        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }

    }
}
