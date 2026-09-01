package ar.edu.unlu.poo.labo1.artefactos;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CatalogoArtefactos {

    private Set<Artefacto> catalogo = new HashSet<>();

    public void agregarArtefacto(Artefacto artefacto)
    {
        catalogo.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos()
    {
        return catalogo;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo)
    {
        Tipo tipo2 = Tipo.AMULETO;
        switch (tipo){
            case "Varita" -> tipo2 = Tipo.VARITA;
            case "Pocion" -> tipo2 = Tipo.POCION;
            case "Pergamino" -> tipo2 = Tipo.PERGAMINO;
            case "Colgante" -> tipo2 = Tipo.COLGANTE;
            case "Amuleto" -> tipo2 = Tipo.AMULETO;
        }

        List<Artefacto> listaArtefactos = catalogo.stream()
                .filter(artefactoTIpo -> tipo2 == artefactoTIpo)
                .collect(Collectors.toList());
    }

}
