package ar.edu.unlu.poo.labo1.artefactos;
import java.util.*;

public class CatalogoArtefactos {

    Set<Artefacto> coleccionArtefactos = new HashSet<>();
    void agregarArtefacto(Artefacto artefacto){
        coleccionArtefactos.add(artefacto);
    }


    Set obtenerArtefactosUnicos(){
        return coleccionArtefactos;
    }


    List buscarArtefactosPorTipo(String tipo){
        List<Artefacto> listaDeTipos = new ArrayList<>();
        int maxi = -1000;

        for(Artefacto artefacto: coleccionArtefactos){
            if(artefacto.getTipo().equals(tipo)){

                listaDeTipos.add(artefacto);
            }

        }
        return listaDeTipos;
    }



    Map<String, Integer> contarArtefactosPorTipo(){
        Map<String, Integer> artefactosPorTipo = new HashMap<>();
        return artefactosPorTipo;
    }

    Artefacto obtenerArtefactoMasPoderoso(){
        int maximo = -100;
        Artefacto artefactoMaximo = null;
        for (Artefacto artefacto : coleccionArtefactos) {
            if(artefacto.getPoder() > maximo){
                maximo = artefacto.getPoder();
                artefactoMaximo = artefacto;
            }
        }
        return artefactoMaximo;
    }
}
