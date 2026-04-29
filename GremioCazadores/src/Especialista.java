public class Especialista extends Cazador implements Bonificable{
    int partesRotas;
    String nombreEscuadron;
    double porcentajeBono;
    public Especialista(String nombre, String alias, TipoArma arma, double danioBase,int partesRotas, String nombreEscuadron, double porcentajeBono) {
        super(nombre, alias, arma, danioBase);
        this.partesRotas = partesRotas;
        this.nombreEscuadron = nombreEscuadron;
        this.porcentajeBono = porcentajeBono;
    }

    public int getPartesRotas() {
        return partesRotas;
    }

    public void setPartesRotas(int partesRotas) {
        this.partesRotas = partesRotas;
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
    public String getNombreEscuadron() {
        return nombreEscuadron;
    }

    @Override
    public double calcularRecompensaExtra() {
        return calcularEficencia()*(porcentajeBono/100);
    }

    @Override
    public double calcularEficencia() {
        return danioBase + (partesRotas * 2.5);
    }

    @Override
    public boolean puedeSubirDeRango() {
        return calcularEficencia() > 100;

    }

    @Override
    public String getRangoActual() {
        if (partesRotas <50){
            return "Veterano";
        } else {
            return "Maestro";
        }

    }
}
