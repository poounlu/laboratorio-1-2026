package ar.edu.unlu.poo.labo1.artefactos;


import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipode;

    public Artefacto (String nombre, int poder, String tipode){
        this.nombre = nombre;
        this.poder=poder;
        this.tipode= tipode;

    }
    public void setArtefacto (String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    @Override
    public boolean equals (Object o){
        if (this == o )
            return  true;
        if(o==null || getClass() !=o.getClass())
            return  false;

    Artefacto artefacto = (Artefacto) o;
        return Object.equals(nombre, artefacto.nombre);
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(nombre);
    }
}

