import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorDeBuilds g = new GestorDeBuilds();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el arma del usuario");
                    String arma = sc.nextLine();
                    System.out.println("Ingrese la armadura del usuario");
                    String armadura=sc.nextLine();
                        g.registrarBuild(arma, armadura);

                    break;
                case 2:
                    System.out.println("Ingrese arma que quiere buscar");
                        String armas=sc.nextLine();
                        g.mostrarBuilds(armas);
                    break;
                case 3:
                    System.out.println("Saliendo");



            }
        }while(opcion!=3);
        sc.close();
    }
}
