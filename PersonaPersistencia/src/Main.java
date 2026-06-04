import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }
    private void readFromTextFile() {
        try {
            BufferedReader mish = new BufferedReader(new FileReader("persona.txt"));
            String linea;
            ArrayList<String>personas=
            while((linea = mish.readLine()) != null){
                System.out.println(linea);

                linea.split(";");


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
