package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoArtefactos {
    Set<Artefacto> catalogo = new HashSet<>();
    List<Artefacto> listaDeArtefacto = new ArrayList<>();

    public void agregarArtefacto( Artefacto unArtefacto){
        catalogo.add(unArtefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return catalogo;
    }


    public List<Artefacto> buscarArtefactosPorTipo(String tipo) {
        List<Artefacto> filtro = catalogo.stream()
                .filter(catalogo -> tipo)
                .collect(Collectors.toList());

        return filtro;
    }

    public Map<String, Integer> contarArtefactosPorTipo() {
        return null;
    }

    public Artefacto obtenerArtefactoMasPoderoso() {
        return null;
    }
}


