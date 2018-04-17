package com.company.Genericos;

public class ClaseGenerica<T> {
    //Definicion de variable tipo generico
    T objeto;

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getName());
    }
}
