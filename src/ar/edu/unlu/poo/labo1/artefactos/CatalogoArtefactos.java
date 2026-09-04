package ar.edu.unlu.poo.labo1.artefactos;
import java.util.*;

public class CatalogoArtefactos {

    private Set<Artefacto> catalogoArtefacto = new HashSet<>();

    void agregarArtefacto(Artefacto artefacto){
        if(artefacto == null){
            throw new IllegalArgumentException("El Artefacto no puede ser nulo");
        }
        this.catalogoArtefacto.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return new HashSet<>(catalogoArtefacto);
    }

    public List buscarArtefactosPorTipo(String tipo){
        List<Artefacto> artefactosBuscados = new ArrayList<>();

        for(Artefacto buscados: catalogoArtefacto){
            if (buscados.getTipo().equals(tipo)){
                artefactosBuscados.add(buscados);
            }
        }
        return artefactosBuscados;
    }

    public Map<String, Integer> contarArtefactosPorTipo(){

        Map<String, Integer> conteo = new HashMap<>();

        for(Artefacto buscados: catalogoArtefacto){
            String tipoActual = buscados.getTipo();
            if(conteo.containsKey(tipoActual)){
                conteo.put(tipoActual,conteo.get(tipoActual) + 1);
            }
            else{
                conteo.put(tipoActual, 1);
            }
        }
        return contarArtefactosPorTipo();
    }

    public Artefacto obtenerArtefactoMasPoderoso(){
        if(catalogoArtefacto.isEmpty()){
            return null;
        }
        Artefacto masPoderoso= new Artefacto("",0,"");
        for(Artefacto artefacto: catalogoArtefacto){
            if(artefacto.getPoder() >= masPoderoso.getPoder()){
                masPoderoso = artefacto;
            }
        }
        return masPoderoso;
    }
}
