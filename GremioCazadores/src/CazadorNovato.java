public class CazadorNovato extends Cazador {
    public CazadorNovato(String nombre, String alias, TipoArma arma, double danioBase) {
        super(nombre, alias, arma, danioBase);
    }

    @Override
    public double calcularEficencia() {
        return 0;
    }

    @Override
    public void mostrarEficencia() {

    }

    @Override
    public boolean puedeSubirDeRango() {
        return false;
    }

    @Override
    public String getRangoActual() {
        return "";
    }
}
