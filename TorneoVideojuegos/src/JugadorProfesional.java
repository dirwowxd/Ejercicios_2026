public class JugadorProfesional extends Jugador implements Patrocinado {

    private int ranking;
    private String nombrePatrocinador;
    private double porcentajeBono;

    public JugadorProfesional(String nombre, String alias, TipoJugador tipo, double puntajeBase, int ranking, String nombrePatrocinador, double porcentajeBono) {
        super(nombre, alias, tipo, puntajeBase);
        this.ranking = ranking;
        this.nombrePatrocinador = nombrePatrocinador;
        this.porcentajeBono = porcentajeBono;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    public String getNombrePatrocinador() {
        return nombrePatrocinador;
    }

    @Override
    public double calcularBono() {
        return calcularPuntaje() * (this.porcentajeBono / 100.0);
    }

    public void setNombrePatrocinador(String nombrePatrocinador) {
        this.nombrePatrocinador = nombrePatrocinador;
    }

    public double getPorcentajeBono() {
        return porcentajeBono;
    }

    public void setPorcentajeBono(double porcentajeBono) {
        this.porcentajeBono = porcentajeBono;
    }


    @Override
    public double calcularPuntaje() {
        return (getPuntajeBase()*(1+ (double) 1 /ranking));
    }

    @Override
    public boolean puedeClasificar() {
        return true;
    }

    @Override
    public String getCategoria() {
        if (ranking <=10){
            return "Profesional";
        } else if (ranking <=50){
            return "Semi-Profesional";
        } else {
            return "Amateur";
        }


    }
}
