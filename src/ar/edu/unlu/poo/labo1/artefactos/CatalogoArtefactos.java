package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    Set<Artefacto> artefactos = new HashSet<>();

    Map<String, List<Artefacto>> tipos  = new HashMap<>();

    void agregarArtefacto(Artefacto artefacto){

        artefactos.add(artefacto);
    }


    public Set obtenerArtefactosUnicos(){
        return artefactos;
    }

    public List buscarArtefactosPorTipo(String tipo){
        List<Artefacto> lista = new ArrayList<>();


        return lista;
    }

    Map<String, Integer> contarArtefactosPorTipo(){


        return null;

    }

    Artefacto obtenerArtefactoMasPoderoso(){

        return null;
    }
}
