import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Cazador> monsterHunter= new ArrayList<Cazador>();
        monsterHunter.add(new CazadorNovato("Pedro", "ElintensoRigbyyy", TipoArma.GLAIVE_INSECTO, 200, 6));
        monsterHunter.add(new CazadorNovato("Javier", "DonXavi",  TipoArma.GLAIVE_INSECTO, 230, 14));
        monsterHunter.add(new CazadorExperto("Kevin", "Vek", TipoArma.MAZO, 1200, 15, "Los waskeros", 20));
        monsterHunter.add(new CazadorExperto("Martina", "Martini", TipoArma.BALLESTA_PESADA, 130, 14, "Los Veterinarios", 20));
        monsterHunter.add(new Especialista("Vicente", "Dirwow", TipoArma.ESPADAS_DUALES,60, 45, "Los xupaAnfibio", 30) );
        monsterHunter.add(new Especialista("Eduardo", "EduardoProGamingXXX", TipoArma.GRAN_ESPADA, 900, 95, "Asesina pasteros", 30));

        for (Cazador cazador : monsterHunter) {
            cazador.mostrarInfo();
            cazador.mostrarEficencia();
            System.out.println("Rango actual" + cazador.getRangoActual());
            System.out.println("Se puede subir de rango? : " + cazador.puedeSubirDeRango());
        }
        for (Cazador cazador : monsterHunter) {
            if (cazador instanceof Bonificable) {
                System.out.println("===CAZADORES BONIFICABLE===");
                Bonificable bonificable = (Bonificable) cazador;
                String alias= cazador.getAlias();

                System.out.println("Alias : "+alias);
                System.out.println("Nombre Escuadron : "+ bonificable.getNombreEscuadron());
                bonificable.calcularRecompensaExtra();

            }
        }
    }


}
