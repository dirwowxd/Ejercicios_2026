import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Persona {
    private  String nombre;
    private String rut;
    private LocalDate fechaNacimiento;
    private ArrayList<Email> emails = new ArrayList<>();

    public Persona(String rut, String nombre, LocalDate fechaNacimiento) {
        this.rut=rut;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getEdad(){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    public void addEmail(Email email) {
        emails.add(email);
    }

    public boolean removeEmail(String diremail) {
        return emails.removeIf(email -> email.getDireccionEmail().equals(diremail));

    }
    public Email[] getEmails() {
        return emails.toArray(new Email[0]);
    }
}
