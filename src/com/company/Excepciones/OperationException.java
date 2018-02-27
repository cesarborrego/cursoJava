package com.company.Excepciones;

public class OperationException extends Exception {

    public OperationException (String mensaje) {
        //Inicializa el mensaje de error de la clase padre
        super(mensaje);
    }
}
