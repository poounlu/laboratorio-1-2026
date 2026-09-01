package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private HashSet<Artefacto> setArtefactos;
    private Map<Artefacto, Integer>  mapArtefactos;
    private ArrayList<Artefacto> arrayArtefactos ;


    public CatalogoArtefactos (){
        this.setArtefactos = new HashSet<>();
        this.mapArtefactos = new HashMap<>();
        this.arrayArtefactos = new ArrayList<>();
    }


    public void agregarArtefacto(Artefacto unArtefacto) {
        setArtefactos.add(unArtefacto);


    }

    public Map<Object, Object> obtenerArtefactosUnicos() {
    }

    public List<Artefacto> buscarArtefactosPorTipo(String amuleto) {
    }

    public Map<String, Integer> contarArtefactosPorTipo() {
    }

    public Artefacto obtenerArtefactoMasPoderoso() {
    }
}
