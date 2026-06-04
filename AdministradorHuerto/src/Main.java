import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        AdministradorHuerto admin = new AdministradorHuerto();
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu");
            System.out.println("1. Registrar PLANTA");
            System.out.println("2. Listar PLANTAS");
            System.out.println("3. Salir");
            System.out.print("Ingrese Opcion : ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Ingrese el tipo de planta");
                    String tipo = sc.nextLine();
                    System.out.println("Ingrese la cantidad de plantas");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    admin.escribirArchivo(tipo, cantidad);
                    break;
                case 2:
                    admin.mostrarArchivo();
                    break;
                case 3:
                    System.out.println("Saliendo");
            }
        } while (opcao != 3);
    }

}
