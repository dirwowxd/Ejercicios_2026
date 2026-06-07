import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IOGremio io = new IOGremio();
        int opcion;
        DateTimeFormatter horaFormatt = DateTimeFormatter.ofPattern("H:mm");

        do {
            System.out.println("MENU");
            System.out.println("1. Registro");
            System.out.println("2. leer Registro");
            System.out.println("3. Salir");
            System.out.println("Opcion: ");
             opcion = sc.nextInt();
             sc.nextLine();
             switch (opcion) {
                 case 1:
                     System.out.print("Ingrese nombre del cazador : ");
                     String nombre = sc.nextLine();
                     TipoArma[] catalogoArmas = TipoArma.values();
                     System.out.println("Ingrese su tipo de arma");
                     for (int i = 0; i < catalogoArmas.length; i++) {
                         System.out.println((i + 1) + ". " + catalogoArmas[i]);
                     }
                     System.out.print("Opción de arma: ");
                     int opcionArma = sc.nextInt();
                     sc.nextLine();
                     TipoArma armaElegida = catalogoArmas[opcionArma - 1];
                     TipoObjetivo [] objetivos = TipoObjetivo.values();
                     for (int i = 0; i < objetivos.length; i++) {
                         System.out.println((i + 1) + ". " + objetivos[i]);
                     }
                     System.out.print("Ingrese el objetivo : ");
                     int objetivo = sc.nextInt();
                     sc.nextLine();
                     TipoObjetivo objetivoElegido = objetivos[objetivo-1 ];
                     System.out.print("Hora de inicio : ");
                     LocalTime horaInicio = LocalTime.parse(sc.nextLine(), horaFormatt);
                     System.out.print("Hora de fin : ");
                     LocalTime horaFin = LocalTime.parse(sc.nextLine(), horaFormatt);
                     io.registrarCaceria(nombre,armaElegida,objetivoElegido, horaInicio, horaFin);
                     break;
                 case 2:
                     io.leerCaceria();
                     break;
                 case 3:
                     System.out.println("Saliendo");


             }

        } while (opcion != 3);
        sc.close();
    }
}
