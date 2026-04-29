import java.lang.classfile.Attribute;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Toyota", "nuevo", 2006, 200));
        vehiculos.add(new Auto("Ford", "viejo", 2025, 100));
        vehiculos.add(new Moto("Shibuya", "Cañete", 2019, 100));
        vehiculos.add(new Moto("Subaru", "lacayo", 2020,500));
        vehiculos.add(new Camion("oppel", "casi viejo", 1999,300));
        vehiculos.add(new Camion("chevrolet", "nuevito", 1899, 100));

        int nuevoprecio = 0;
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.calcularSeguro();
            System.out.println("======");
            vehiculo.mostrar();
            nuevoprecio+= (int) vehiculo.getprecio();




        }
        System.out.println("valor total: " + nuevoprecio);



    }
}
