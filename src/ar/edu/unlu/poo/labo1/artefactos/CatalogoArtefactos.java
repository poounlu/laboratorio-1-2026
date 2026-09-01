package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {

    //creo un hashset xq no admite duplicados.
    Set<Artefacto> Catalogo = new HashSet<>();

    void agregarArtefacto(Artefacto artefacto) {
        Catalogo.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos() {
        return Catalogo;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo) {
        List<Artefacto> catalogoTipo = new ArrayList<>();
        for (Artefacto a : Catalogo) {
            if (Objects.equals(a.tipo, tipo)) {
                catalogoTipo.add(a);
            }
        }
        return catalogoTipo;
    }

    public Map<String, Integer> contarArtefactosPorTipo() {
        return null;
    }

    public Artefacto obtenerArtefactoMasPoderoso() {
        Artefacto poderoso = null;
        if (Catalogo == null) {
            return null;
        }
        int maximo = 0;
        for (Artefacto a : Catalogo) {
            if (a.getPoder() > maximo) {
                maximo = a.getPoder();
                poderoso = a;
            }
        }
        return poderoso;
    }
}
