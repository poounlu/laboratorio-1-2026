package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {

    private String nombre;
    private int poder;
    private String tipo; //String?

    public Artefacto(String nombre, int poder, String tipo)
    {
        if(poder < 0 || poder > 100) throw new IllegalArgumentException("El poder debe ser un entero entre 0 y 100");
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;
    }

    public String getNombre(){return nombre;}
    public String getTipo(){return tipo;}
    public int getPoder(){return poder;}






    @Override
    public boolean equals(Object o) {
        //Valido que sea el mismo tipo de objeto
        if(this == o) return true;

        //Verifico si es nulo o de una clase distinta
        if(o == null || getClass() != o.getClass()) return false;

        //Convierto el objeto a un Artefacto y comparamos los campos clave
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

}
