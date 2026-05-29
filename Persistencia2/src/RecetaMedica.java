import java.time.LocalDate;
import java.util.ArrayList;

public class RecetaMedica {
    private int nroReceta;
    private String nombrePaciente;
    private LocalDate fecha;
    private ArrayList<String> nombreMedicamentos;

    public RecetaMedica(int nroReceta, String nombrePaciente, LocalDate fecha) {
        this.nroReceta = nroReceta;
        this.nombrePaciente = nombrePaciente;
        this.fecha = fecha;
        this.nombreMedicamentos = new ArrayList<>();
    }

    public int getNroReceta() {
        return nroReceta;
    }

    public void setNroReceta(int nroReceta) {
        this.nroReceta = nroReceta;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<String> getNombreMedicamentos() {
        return nombreMedicamentos;
    }

    public void setNombreMedicamentos(ArrayList<String> nombreMedicamentos) {
        this.nombreMedicamentos = nombreMedicamentos;
    }

    public int getNroMedicamentos() {
        int NroMedicamentos=1;
        for (String nombreMedicamento : nombreMedicamentos) {
            NroMedicamentos += nombreMedicamento.length();
        }
        return NroMedicamentos;
    }
    public boolean estaNombreMedicamentos(String nombreMedicamento) {
        for (String nombre : nombreMedicamentos) {
            if (nombre.equals(nombreMedicamento)){

                return true;
            }
        }
        return false;
    }
    public boolean addNombreMedicamento(String nombreMedicamento) {
        for (String nombre : nombreMedicamentos) {
            if(!nombre.contains(nombreMedicamento)) {
                nombreMedicamentos.add(nombreMedicamento);
                return true;
            }
        }
        return false;
    }

    public String []  getNombreMedicamentosArray() {

        return nombreMedicamentos.toArray(new String[0]);

    }
    @Override
    public String toString() {
        return "Receta : "+nroReceta+"\n"+"Paciente : "+nombrePaciente+"\n"+ "Medicamentos : "+getNombreMedicamentos()+ " Fecha "+ getFecha();

    }


}
