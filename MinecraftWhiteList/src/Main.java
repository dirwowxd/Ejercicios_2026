import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GestorAcceso gestor = new GestorAcceso();
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Agregar Jugadores");
            System.out.println("2. Listar Jugadores");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingresa el nombre del jugador");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el rango del jugador");
                    String rango = sc.next();
                    sc.nextLine();
                    gestor.agregarJugador(nombre,rango);
                    break;
                case 2:
                    gestor.cargarYMostrarJugadores();
                    break;
                case 3:
                    System.out.println("Saliendo");
            }

        } while (opcion != 3);
    }
}
