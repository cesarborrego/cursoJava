package com.company.enumeraciones;

/**
 * @author Cesar Segura Granados 12,octubre,2017
 * @version 1.0
 */
public class EjemploEnumeraciones {

    public EjemploEnumeraciones() {
        System.out.println("Continente n3 " + Continentes.AMERICA);
        System.out.println("Paises en America " + Continentes.AMERICA.getPaises());
        System.out.println("");
        indicarPaises(Continentes.AFRICA);
        System.out.println("");
        imprimirContinentes();
    }

    private void indicarPaises(Continentes continentes) {
        switch (continentes) {
            case AFRICA:
                System.out.println("Paises en " + continentes + ": " + Continentes.AFRICA.getPaises());
                break;
            default:
                System.out.println("Pais no valido");
        }
    }

    private void imprimirContinentes() {
        for (Continentes c :
                Continentes.values()) {
            System.out.println("Continente " + c + " contiene " + c.getPaises() + " paises");
        }
    }
}
