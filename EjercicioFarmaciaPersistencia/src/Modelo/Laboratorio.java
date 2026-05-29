package Modelo;

import java.util.ArrayList;

public class Laboratorio {
    private String nombre;
    private String telefono;
    private String direccion;
    private ArrayList<Medicamento> medicamentos;

    public Laboratorio(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void addMedicamento(Medicamento medicamento){
        medicamentos.add(medicamento);
    }
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}
