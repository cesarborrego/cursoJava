package com.company.Colecciones;

import java.util.*;

public class ManejoColecciones {

    public ManejoColecciones() {
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        //Elemento repetido
        miLista.add("4");
        imprimir(miLista);

        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //Este elemento duplicado sera ignorado
        //porque no se permite
        miSet.add("300");
        imprimir(miSet);

        Map miMapa = new HashMap();
        //Llave valor
        miMapa.put("1", "cesar");
        miMapa.put("2", "patsy");
        miMapa.put("3", "brenda");
        miMapa.put("4", "duby");
        //se imprimen todas las llaves
        imprimir(miMapa.keySet());
        //se imprimen todos los valores del mapa
        imprimir(miMapa.values());
    }

    private static void imprimir(Collection collection) {
        for (Object elemento :
                collection) {
            System.out.println(elemento + " ");
        }
        System.out.println("");
    }
}
