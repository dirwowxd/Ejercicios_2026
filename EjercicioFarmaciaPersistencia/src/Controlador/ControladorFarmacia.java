package Controlador;

import Excepciones.FarmaciaException;
import Modelo.Laboratorio;
import Modelo.Medicamento;
import Modelo.Tipo;

import java.util.ArrayList;
import java.util.Optional;

public class ControladorFarmacia {
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<Laboratorio> laboratorios;
    private static ControladorFarmacia instancia;
    private ControladorFarmacia(){

    }
    public static ControladorFarmacia getInstancia(){
        if(instancia == null){

            instancia = new ControladorFarmacia();
        }
        return instancia;
    }
    public void addLaboratorio(String nome, String fono, String dir) throws FarmaciaException {
        Optional<Laboratorio> buscarLab= findLaboratorio(nome);
        if(buscarLab.isPresent()){
            throw new FarmaciaException("Laboratorio existente : "+nome);
        }
        Laboratorio lab = new Laboratorio(nome,fono,dir);
        laboratorios.add(lab);

    }
    public void addMedicamento(String nome, Tipo pres, int precio, String nomLab) throws FarmaciaException {
        Optional<Medicamento> buscarMed= findMedicamento(nome, pres);
        if(buscarMed.isPresent()){
            throw new FarmaciaException("Medicamento existente : "+nome);
        }
        Medicamento med= new Medicamento(pres, precio, nome);
        medicamentos.add(med);
    }
    public void addCliente(String rut, String nome, )


    private Optional<Medicamento> findMedicamento(String nome, Tipo presentacion) {
        for (Medicamento m : medicamentos) {
            if (nome.equals(m.getNombre()) && presentacion.equals(m.getPresentacion())) {
                return Optional.of(m);
            }

        }
        return null;
    }
    private Optional<Laboratorio> findLaboratorio(String nome) {
        for (Laboratorio l : laboratorios) {
            if (nome.equals(l.getNombre())) {
                return Optional.of(l);
            }
        }
        return Optional.empty();
    }



}
