package com.biblioteca.mantener;

public class Prestatario extends General {
    private String telefono;
    private String direccion;
    private String ruc;

    public Prestatario() {

    }

    public Prestatario(String telefono, String direccion, String ruc) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.ruc = ruc;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public  String getTelefono() {
        return  telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public  String getDireccion() {
        return  direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public  String getDireccion() {
        return  direccion;
    }

    


}
