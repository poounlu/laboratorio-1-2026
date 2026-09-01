package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> artefactos;

    public CatalogoArtefactos() {
        this.artefactos = new HashSet<>();
    }

    public void agregarArtefacto (Artefacto artefacto) {
        artefactos.add(artefacto);
    }

    public Set obtenerArtefactosUnicos() {
        return artefactos;
    }

    public List buscarArtefactosPorTipo (String tipo) {
        List<Artefacto> lista = new ArrayList<>();

        for (Artefacto a : artefactos) {
            if (a.getTipo().equals(tipo)) {
                lista.add(a);
            }
        }

        return lista;
    }

    public Map<String, Integer> contarArtefactosPorTipo() {
        Map<String, Integer> artefactosPorTipo = new HashMap<>();

        for (Artefacto a : artefactos) {
            if (!artefactosPorTipo.containsKey(a.getTipo())) {
                artefactosPorTipo.put(a.getTipo(), 1);
            }
            else {
                artefactosPorTipo.put(a.getTipo(), (artefactosPorTipo.get(a.getTipo()) + 1));
            }
        }

        return artefactosPorTipo;
    }

    public Artefacto obtenerArtefactoMasPoderoso() {
        if (artefactos.isEmpty()) return null;

        int poderMax = 0;
        for (Artefacto a : artefactos) {
            if (a.getPoder() > poderMax) {
                poderMax = a.getPoder();
            }
        }

        Artefacto artefacto;
        for (Artefacto a : artefactos) {
            if (a.getPoder() == poderMax) {
                artefacto = a;
            }
        }

        return artefacto;
    }
}

/*Clase CatalogoArtefactos:
Artefacto obtenerArtefactoMasPoderoso(): Devuelve el artefacto con el mayor nivel de poder. Si hay varios con el mismo poder máximo, puede devolver cualquiera de ellos. Si el catálogo está vacío, debe devolver null.*/