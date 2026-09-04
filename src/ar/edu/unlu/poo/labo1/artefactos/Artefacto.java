package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;

    public Artefacto(String nombre, int poder, String tipo) {
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    public String getTipo() {
        return tipo;
    }


    @Override
    public boolean equals(Object objeto) {
        if(this == objeto) return true;
        if (objeto == null || getClass() != objeto.getClass()) return false;

        Artefacto artefacto = (Artefacto) objeto;
        return Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), nombre);
    }
}
