public class Auto  extends Vehiculo{

    public Auto(String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, precio);
    }

    @Override
    public double calcularSeguro(){
        return getprecio()*0.05;
    }


}
