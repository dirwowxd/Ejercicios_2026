public class CazadorNovato extends Cazador {
    int misionesCompletadas;

    public CazadorNovato(String nombre, String alias, TipoArma arma, double danioBase, int misionesCompletadas) {
        super(nombre, alias, arma, danioBase);
        this.misionesCompletadas = misionesCompletadas;
    }

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public void setMisionesCompletadas(int misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }

    @Override
    public double calcularEficencia() {
        return danioBase *(misionesCompletadas * 1.5);
    }

    @Override
    public void mostrarEficencia() {

    }

    @Override
    public boolean puedeSubirDeRango() {
        if (calcularEficencia()>=50) {
            return true;
        } else  {
            return false;
        }
    }

    @Override
    public String getRangoActual() {
        if (calcularEficencia()<30){
            return "Bronce";
        }else if (calcularEficencia()>=30 && calcularEficencia()<=50) {
            return "Plata";
        }else {
            return "Oro";
        }

    }
}
