package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto{
    String nombre;
    int Poder;
    String tipo;

    public Artefacto(String nombre, int nivel_poder, String tipo) {
        this.nombre = nombre;
        this.Poder = nivel_poder;
        this.tipo = tipo;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    //Getters.
    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return Poder;
    }

    public String getTipo() {
        return tipo;
    }


}
