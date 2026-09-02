package ar.edu.unlu.poo.labo1.artefactos;

import ar.edu.unlu.poo.labo1.libreria.Libro;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;

    public Artefacto(String nombre, int poder, String tipo) {
        if(poder < 0 || poder > 100){
            throw new IllegalArgumentException("El poder debe estar entre 0 y 100");
        }
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
    public boolean equals(Object o) {
        // 1. ¿Somos el mismo objeto en memoria?
        if (this == o) return true;
        // 2. ¿Es nulo o de una clase diferente?
        if (o == null || getClass() != o.getClass()) return false;
        // 3. Convertimos el objeto y comparamos los campos clave
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(artefacto.nombre, nombre);
    }

    @Override
    public int hashCode() {
        // 4. Generamos un hash code a partir de los mismos campos
        return Objects.hash(nombre);
    }
}
