import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new JugadorCasual("Pedro", "ElRompeCraneos", TipoJugador.CASUAL, 100, 50 ));
        jugadores.add(new JugadorCasual("Alejandro", "Mordecai456_", TipoJugador.CASUAL, 100, 40 ));
        jugadores.add(new JugadorProfesional("Pepe", "intenso rigby", TipoJugador.PROFESIONAL, 60, 1040, "RedBull", 30) );
        jugadores.add(new JugadorProfesional("Martin", "DON TROLL", TipoJugador.PROFESIONAL, 60,5, "RedBull", 30  ) );
        jugadores.add(new Streamer("LoPEZ", "ReneGul", TipoJugador.STREAMER, 90, 100000, "Kick", "InfoJobs", 50));
        jugadores.add(new Streamer("Arturo", "King Vidal", TipoJugador.STREAMER, 90, 10000, "twitch", "InfoJobs", 50));
        int puntaje=0;
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.mostrarInfo());
            jugador.mostrarPuntaje();
            System.out.println( "Este jugador esta clasificado ? : "+jugador.puedeClasificar());
            System.out.println(jugador.getCategoria());
            puntaje+= (int) jugador.calcularPuntaje();
        }
        for (Jugador jugador : jugadores) {
            if (jugador instanceof Patrocinado) {
                Patrocinado patrocinado = (Patrocinado) jugador;
                String sponsor= patrocinado.getNombrePatrocinador();
                double bono= patrocinado.calcularBono();
                System.out.println("Patrocinado: "+ sponsor +"|"+ "Bono : "+ bono);
            }
        }
        System.out.println("Puntaje total: " + puntaje);

    }
}
