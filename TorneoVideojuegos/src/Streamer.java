public class Streamer extends Jugador{
    private int seguidores;
    private String plataforma,nombrePatrocinador;
    private double porcentajeBono;


    public Streamer(String nombre, String alias, TipoJugador tipo, double puntajeBase, int seguidores, String plataforma, String nombrePatrocinador, double porcentajeBono) {
        super(nombre, alias, tipo, puntajeBase);
        this.seguidores = seguidores;
        this.plataforma = plataforma;
        this.nombrePatrocinador = nombrePatrocinador;
        this.porcentajeBono = porcentajeBono;

    }

    @Override
    public double calcularPuntaje() {
        return getPuntajeBase()+ (double) seguidores /1000;
    }

    @Override
    public boolean puedeClasificar() {
        return calcularPuntaje() > 150;


    }

    @Override
    public String getCategoria() {
        if (seguidores<10000) {
            return "Nano";
        }
        if (seguidores>10000 && seguidores<100000) {
            return "Micro";
        }
        else {
            return "macro";
        }
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public String getNombrePatrocinador() {
        return nombrePatrocinador;
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
}
