package ar.edu.unlu.poo.labo1.artefactos;

import ar.edu.unlu.poo.labo1.libreria.Libro;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;

    public Artefacto(String nombre, int poder, String tipo)
    {
        this.nombre=nombre;
        if(poder>=1 && poder<=100)
        {
            this.poder = poder;
        }
        this.tipo=tipo;
    }

    public int getPoder() {
        return poder;
    }

    public String getNombre() {
        return nombre;
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
        return Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public int hashCode() {
        // 4. Generamos un hash code a partir de los mismos campos
        return Objects.hash(nombre);
    }
}
