package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {

    private Set<Artefacto> setArtefactos;

    public CatalogoArtefactos() {

        this.setArtefactos = new HashSet<>();
    }

    public void agregarArtefacto(Artefacto artefacto) {
        //La coleccion SET valida que no este repetido, no hacemos esa validacion nosotros
        if(artefacto == null) throw new IllegalArgumentException("El artefacto no puede ser nulo");
        setArtefactos.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos() {
        return setArtefactos;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo)
    {
        List<Artefacto> l_artefactos = new ArrayList<>();
        Iterator<Artefacto> iterador = setArtefactos.iterator();

        while (iterador.hasNext()) {
            Artefacto unArtefacto = iterador.next();
            if(unArtefacto.getTipo().equals(tipo)){
                l_artefactos.add(unArtefacto);
            }
        }
        l_artefactos.sort(Comparator.comparing(Artefacto::getPoder).reversed());
        return l_artefactos;
    }

    public Map<String, Integer> contarArtefactosPorTipo()
    {
        Map<String, Integer> diccionario = new HashMap<>();
        Iterator<Artefacto> iterador = setArtefactos.iterator();
        int contadorPorTipo = 0;

        while (iterador.hasNext()) {
            Artefacto unArtefacto = iterador.next();
            String tipo = unArtefacto.getTipo();

            if(!diccionario.containsKey(tipo)) {
                diccionario.put(tipo, 1);
            }
            else {
                contadorPorTipo = diccionario.get(tipo);
                diccionario.put(tipo, contadorPorTipo+1);
            }
        }
        return diccionario;
    }

    public Artefacto obtenerArtefactoMasPoderoso()
    {


        int poderMax = 0;
        Artefacto artefactoMasPoderoso = null;
        Iterator<Artefacto> iterador = setArtefactos.iterator();

        if(iterador.hasNext()){
            artefactoMasPoderoso = iterador.next();
            poderMax = artefactoMasPoderoso.getPoder();
        }

        while (iterador.hasNext()) {
            Artefacto unArtefacto = iterador.next();
            int poder = unArtefacto.getPoder();
            if(poder > poderMax) {
                poderMax = poder;
                artefactoMasPoderoso = unArtefacto;
            }
        }
        return artefactoMasPoderoso;
    }


}
