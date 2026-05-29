package Modelo;

import java.util.ArrayList;

public class Medicamento {
    private String nombre;
    private int precio;
    private Tipo presentacion;
    private ArrayList<Laboratorio> laboratorios;
    private ArrayList<Cliente> clientes;

    public Medicamento(Tipo presentacion, int precio, String nombre) {
        this.presentacion = presentacion;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Tipo getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Tipo presentacion) {
        this.presentacion = presentacion;
    }
    public  Laboratorio getLaboratorio() {
        return laboratorios.getFirst();
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
