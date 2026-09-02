package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> almacen = new HashSet<>();


    public CatalogoArtefactos(Artefacto artefacto) {

    }

    public void agregarArtefacto(Artefacto artefacto){
        almacen.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return almacen;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        List<Artefacto> misArtefactos = new ArrayList<>();

        for (Artefacto a : almacen){
            if (a.getTipo().equals(tipo)) misArtefactos.add();
        }

        return null;
    }

    public Map<String, Integer> contarArtefactosPorTipo(){
        return null;
    }

    public Artefacto obtenerArtefactoMasPoderoso(){
        return null;
    }
}
