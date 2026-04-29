public abstract class Vehiculo  implements Asegurable, Vendible {
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }


    @Override
    public double getprecio() {
        return precio;
    }

    @Override
    public void vender() {
        Vendible.super.vender();
    }

    public void mostrar(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio: " + precio);
        System.out.println("Seguro: "+ (precio-calcularSeguro()));

    }

}
