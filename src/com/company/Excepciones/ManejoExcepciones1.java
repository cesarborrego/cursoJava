package com.company.Excepciones;

public class ManejoExcepciones1 {

    public ManejoExcepciones1 () {
        try {
            Division division = new Division(10, 0);
            division.visualizarOperacion();
        } catch (OperationException e) {
            e.printStackTrace();
        }
    }
}
