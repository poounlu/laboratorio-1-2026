package ar.edu.unlu.poo.labo1.artefactos;

import ar.edu.unlu.poo.labo1.libreria.Libro;

import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> artefactos= new HashSet<>();

    public void agregarArtefacto(Artefacto artefacto)
    {
        boolean bandera=true;
        for (Artefacto art : artefactos)
        {
            if (art.equals(artefacto))
            {
                bandera=false;
            }
        }
        if (bandera)
        {
            artefactos.add(artefacto);
        }
    }

    public Set<Artefacto> obtenerArtefactosUnicos()
    {
        return this.artefactos;
    }

    List<Artefacto> buscarArtefactosPorTipo(String tipo)
        {
            List<Artefacto> tipoArtefactos= new ArrayList<>();

            for (Artefacto art: artefactos)
            {
                if (art.getTipo().equals(tipo))
                {
                    tipoArtefactos.add(art);
                }
            }
            tipoArtefactos.sort((Artefacto a1, Artefacto a2) -> a2.getPoder() - a1.getPoder());
            return tipoArtefactos;
    }

    Map<String,Integer> contarArtefactosPorTipo()
    {
        Map<String, Integer> artefactosPorTipo= new HashMap<>();
        for (Artefacto art: artefactos)
        {
            if(artefactosPorTipo.containsKey(art.getTipo()) )
            {
                int conteoActual= artefactosPorTipo.get(art.getTipo());
                artefactosPorTipo.put(art.getTipo(), conteoActual +1);
            }
            else {
                artefactosPorTipo.put(art.getTipo(), 1);
            }
        }
        return artefactosPorTipo;
    }

    public Artefacto obtenerArtefactoMasPoderoso()
    {
        Artefacto artefactoMasPoderoso= null;
        int valorMaximo=1;

        for (Artefacto art: artefactos)
        {
            if (art.getPoder() >= valorMaximo)
            {
                artefactoMasPoderoso= art;
                valorMaximo=art.getPoder();
            }
        }
        return artefactoMasPoderoso;
    }
    }
