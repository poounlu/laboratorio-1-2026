package ar.edu.unlu.poo.labo1.artefactos;
import java.util.*;

public class main {
    public static void main(String[] args) {

        CatalogoArtefactos catalogo1 = new CatalogoArtefactos();

        Artefacto artefacto1 = new Artefacto("SuperVarita", 99, "Varita");
        Artefacto artefacto2 = new Artefacto("SuperVarita", 99, "Varita");
        Artefacto artefacto3 = new Artefacto("PocionX", 9, "Poción");
        Artefacto artefacto4 = new Artefacto("PergaminoY", 79, "Pergamino");
        Artefacto artefacto5 = new Artefacto("AmuletoZ", 10, "Amuleto");

        catalogo1.agregarArtefacto(artefacto1);
        catalogo1.agregarArtefacto(artefacto2);
        catalogo1.agregarArtefacto(artefacto3);
        catalogo1.agregarArtefacto(artefacto4);
        catalogo1.agregarArtefacto(artefacto5);

        System.out.println(
                "o: " + catalogo1.obtenerArtefactosUnicos().size()
        );

        System.out.println(
                "Pociones encontradas" + catalogo1.buscarArtefactosPorTipo("Poción")
        );

        System.out.println(
            "Contador de artefactos" + catalogo1.contarArtefactosPorTipo()
        );

        System.out.println(
                "Mas Poderosos" + catalogo1.obtenerArtefactoMasPoderoso()
        );





    }
}
