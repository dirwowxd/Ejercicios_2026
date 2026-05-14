import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Persona {
    private String nombre;
    private String direccion;
    private LocalDate fechaNacimiento;
    private EstadoCivil estadoCivil;
    private float estatura;

    public Persona(String nombre, String direccion, LocalDate fechaNacimiento, EstadoCivil estadoCivil, float estatura ) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.estatura = estatura;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad(){
        return (int)(ChronoUnit.YEARS.between(fechaNacimiento,LocalDate.now()));
    }
    @Override
    public String toString() {
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaNacimiento.format(formatter);

        return nombre + "; " + direccion + "; " + fechaFormateada + "; " + estadoCivil + "; " + estatura;
    }

}
