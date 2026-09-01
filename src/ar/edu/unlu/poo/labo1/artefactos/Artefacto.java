package ar.edu.unlu.poo.labo1.artefactos;

import ar.edu.unlu.poo.labo1.libreria.Libro;

import java.util.Objects;

public class Artefacto {
    private String nombreArtefacto;
    private int nivelPoder;
    private String tipoArtefacto;

    public Artefacto(String nombreArtefacto, int nivelPoder, String tipoArtefacto){
        this.nombreArtefacto = nombreArtefacto;
        this.nivelPoder = nivelPoder;
        this.tipoArtefacto = tipoArtefacto;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public String getNombreArtefacto() {
        return nombreArtefacto;
    }

    public String getTipoArtefacto() {
        return tipoArtefacto;
    }

    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombreArtefacto, artefacto.nombreArtefacto);
    }

    public int hashCode() {

        return Objects.hash(nombreArtefacto, nivelPoder, tipoArtefacto);
    }

    public String getNombre() {
        return nombreArtefacto;
    }

    public int getPoder() {
        return nivelPoder;
    }
}


}
