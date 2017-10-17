package com.company;

/**
 * @author Cesar Segura Granados 12,octubre,2017
 * @version 1.0
 */
public class AutoBoxingUnboxing {
    private Integer enteroObj;
    private Float flotanteObj;
    private Double doubleObj;
    private int entero;
    private float flotante;
    private double doble;


    //Bloque anonimo de inicializacion de atributos
    {
        enteroObj = 10;
        flotanteObj = 15.2F;
        doubleObj = 40.1;

        entero = enteroObj;
        flotante = flotanteObj;
        doble = doubleObj;
    }

    public AutoBoxingUnboxing() {
        System.out.println("Autoboxing");
        System.out.println("Valor entero "+enteroObj);
        System.out.println("Valor flotante "+flotanteObj);
        System.out.println("Valor doble "+doubleObj);
        System.out.println("Unboxing");
        System.out.println("Valor entero "+entero);
        System.out.println("Valor flotante "+flotante);
        System.out.println("Valor doble "+doble);
    }
}
