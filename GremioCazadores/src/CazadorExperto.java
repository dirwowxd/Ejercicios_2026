public class CazadorExperto extends Cazador implements Bonificable{
    int nivelMaestria;
    String nombreEscuadron;
    double porcentajeBono;

    public CazadorExperto(String nombre, String alias, TipoArma arma, double danioBase,  int nivelMaestria, String nombreEscuadron, double porcentajeBono) {
        super(nombre, alias, arma, danioBase);
        this.nivelMaestria = nivelMaestria;
        this.nombreEscuadron = nombreEscuadron;
        this.porcentajeBono = porcentajeBono;
    }

    public int getNivelMaestria() {
        return nivelMaestria;
    }

    public void setNivelMaestria(int nivelMaestria) {
        this.nivelMaestria = nivelMaestria;
    }

    public void setNombreEscuadron(String nombreEscuadron) {
        this.nombreEscuadron = nombreEscuadron;
    }

    public double getPorcentajeBono() {
        return porcentajeBono;
    }

    public void setPorcentajeBono(double porcentajeBono) {
        this.porcentajeBono = porcentajeBono;
    }

    @Override
    public double calcularEficencia() {
        return danioBase*(1+((double) nivelMaestria /10));
    }

    @Override
    public boolean puedeSubirDeRango() {
        return true;
    }

    @Override
    public String getRangoActual() {
        if (nivelMaestria<=5) {
            return "Platino";
        }
        if (nivelMaestria<=10) {
            return "Diamante";
        } else {
            return "Leyenda";
        }
    }

    @Override
    public String getNombreEscuadron() {
        return nombreEscuadron;
    }

    @Override
    public double calcularRecompensaExtra() {
        return calcularEficencia()*(porcentajeBono/100);
    }
}
