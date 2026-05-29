package Modelo;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String rut;
    private String email;
    private ArrayList<Medicamento> medicamentos;


    public String getRut() {
        return rut;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public void  addMedicamento(Medicamento medicamento){
        this.medicamentos.add(medicamento);
    }
    public  ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }


}
