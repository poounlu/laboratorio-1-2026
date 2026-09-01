package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private Integer poder;
    private String tipo;

    public Artefacto(String nombre, Integer poder, String tipo){
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Integer getPoder(){
        return this.poder;
    }

    public String getTipo(){
        return this.tipo;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Artefacto unArtefacto = (Artefacto) o;
        return Objects.equals(nombre, unArtefacto.nombre) && Objects.equals(tipo, unArtefacto.tipo);


    }
    @Override
    public int hashCode(){
        return Objects.hash(nombre, tipo);
    }

}
