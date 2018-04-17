package com.company.Genericos;

import java.util.*;

public class ManejoColeccionesGenercias {

    public ManejoColeccionesGenercias() {
        List<String> miLista = new ArrayList<>();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        miLista.add("4");
        imprimir(miLista);

        Set<String> miSet = new HashSet<>();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");
        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("4", "cesar");
        miMapa.put("2", "patsy");
        miMapa.put("3", "brenda");
        miMapa.put("1", "duby");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    static void imprimir(Collection<String> collection) {
        for (String elemento :
                collection) {
            System.out.println("Elemento " + elemento);
        }
        System.out.println("");
    }
}
