package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String artefactoNombre;
    private Tipo artefactoTipo;
    private int artefactoPoder;

    public String getArtefactoNombre() {
        return artefactoNombre;
    }

    public String getArtefactoTipo() {
        return switch (artefactoTipo){
            case VARITA -> "Varita";
            case POCION -> "Pocion";
            case PERGAMINO -> "Pergamino";
            case COLGANTE -> "Colgante";
            case AMULETO -> "Amuleto";
        };
    }

    public int getArtefactoPoder() {
        return artefactoPoder;
    }

    public Artefacto(String artefactoNombre, int artefactoPoder, String artefactoTipo) {
        this.artefactoNombre = artefactoNombre;
        this.artefactoPoder = artefactoPoder;
        switch (artefactoTipo){
            case "Varita" -> this.artefactoTipo = Tipo.VARITA;
            case "Pocion" -> this.artefactoTipo = Tipo.POCION;
            case "Pergamino" -> this.artefactoTipo = Tipo.PERGAMINO;
            case "Colgante" -> this.artefactoTipo = Tipo.COLGANTE;
            case "Amuleto" -> this.artefactoTipo = Tipo.AMULETO;
        }

    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(artefactoNombre, artefacto.artefactoNombre);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(artefactoNombre);
    }

}
