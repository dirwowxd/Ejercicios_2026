public interface Vendible {
    double getprecio();
    default void vender(){
        System.out.println("Vendido por:" + getprecio());
    }
}
