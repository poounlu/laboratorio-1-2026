package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> misArtefactos;
    public CatalogoArtefactos() {
        this.misArtefactos = new HashSet<>();
    }

    public void agregarArtefacto(Artefacto artefacto){
        this.misArtefactos.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return misArtefactos;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        List<Artefacto> artefactos = new ArrayList<>();
        Iterator<Artefacto> iterador = misArtefactos.iterator();
        while(iterador.hasNext()){
            Artefacto artefacto = iterador.next();
            if(artefacto.getTipo().equals(tipo)){
                artefactos.add(artefacto);
            }
        }
        artefactos.sort(Comparator.comparingInt(Artefacto::getPoder).reversed());
        return artefactos;
    }

    public Map<String, Integer> contarArtefactosPorTipo(){
        Map<String, Integer> mapeoPorTipos = new HashMap<>();
        Iterator<Artefacto> iterador = misArtefactos.iterator();
        while(iterador.hasNext()){
            Artefacto artefacto = iterador.next();
            String tipo = artefacto.getTipo();
            if(mapeoPorTipos.containsKey(tipo)){
                mapeoPorTipos.put(tipo, mapeoPorTipos.get(tipo) + 1);
            } else {
                mapeoPorTipos.put(tipo, 1);
            }
        }
        return mapeoPorTipos;

    }

    public Artefacto obtenerArtefactoMasPoderoso(){
        Iterator<Artefacto> iterador = misArtefactos.iterator();
        Artefacto mayor = null;
        while(iterador.hasNext()){
            Artefacto artefacto = iterador.next();
            if(mayor == null || artefacto.getPoder() > mayor.getPoder()){
                mayor = artefacto;
            }
        }
        return mayor;
    }


}
