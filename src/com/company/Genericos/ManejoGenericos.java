package com.company.Genericos;

public class ManejoGenericos {

    public ManejoGenericos() {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
        objetoInt.obtenerTipo();
        //Instancia para tipo String
        //Se puede utilizar la inferencia del tipo del lado derecho
        ClaseGenerica<String> objetoStr = new ClaseGenerica<>("Hola");
        objetoStr.obtenerTipo();
        //Los genericos no pueden aplicarse a primitivos
        //ClaseGenerica<int> objetoStr = new ClaseGenerica<>(88);
    }
}
