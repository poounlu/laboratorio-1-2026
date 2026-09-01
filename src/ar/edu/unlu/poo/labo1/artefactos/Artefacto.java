package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;

    public Artefacto (String nombre, int poder, String tipo) {
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
        return Objects.equals(nombre, artefacto.nombre) &&
                Objects.equals(tipo, artefacto.tipo) &&
                Objects.equals(poder, artefacto.poder);

    }

    @Override
    public int hashCode() {
        // 4. Generamos un hash code a partir de los mismos campos
        return Objects.hash(nombre, tipo, poder);
    }
}


/*Clase Artefacto:
Atributos: nombre (String), poder (int), tipo (¿String?).
Constructor para inicializar todos los atributos.
Métodos getters para todos sus atributos.
Implementación correcta de equals() y hashCode(): dos artefactos se consideran iguales si tienen el mismo nombre.*/