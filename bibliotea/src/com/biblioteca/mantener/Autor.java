package com.biblioteca.mantener;

public class Autor extends General{
    private String observacion;
    private int LibroPublicado;
    private Pais pais;

    public Autor() {

    }

    public Autor(String observacion, int LibroPublicado, Pais pais){
        this.observacion = observacion;
        this.LibroPublicado = LibroPublicado;
        this.pais = pais;
    }

    public void setObservacion( String observacion){
        this.observacion = observacion;
    }

    public String getObservacion(){
        return observacion;
    }

    public void setLibropublicado( int LibroPublicado){
        this.LibroPublicado = LibroPublicado;
    }

    public int getLibropublicado(){
        return LibroPublicado;
    }

    public void setPais( Pais pais){
        this.pais = pais;
    }

    public Pais getPais(){
        return pais;
    }

    @Override
    public String toString(){
        return "Autor {}" + super.toString() + "Observacion:" + observacion + 
        ", Libro Publicado= " + LibroPublicado  + ", Pais = " + pais + '}';
    }



}
