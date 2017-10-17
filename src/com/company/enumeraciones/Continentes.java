package com.company.enumeraciones;

/**
 * @author Cesar Segura Granados 12,octubre,2017
 * @version 1.0
 */
public enum Continentes {
    AFRICA(53),
    ASIA(46),
    AMERICA(44),
    EUROPA(100),
    OCEANIA(80);

    //Atributo de cada elemento de la enumeracion
    private final int paises;

    //Constructor de cada elemento de la enumeracion
    Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return paises;
    }
}
