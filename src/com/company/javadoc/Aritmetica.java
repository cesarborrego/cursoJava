package com.company.javadoc;

/**
 * @author Cesar Segura Granados 12,octubre,2017
 * @version 1.0
 */
public class Aritmetica {
    /**
     * Primer Operando
     */
    int operandoA;
    /**
     * Segundo Operando
     */
    int operandoB;

    /**
     * Constructor vacio de la clase
     */
    public Aritmetica() {

    }
    /**
     * Constructor con dos argumentos de la clase
     */
    public Aritmetica(int operandoA, int operandoB) {
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
    /**
     *Este metodo realiza la suma de dos operandos enteros
     * @return int resultado de la suma
     */
    public int sumar() {
        return operandoA+operandoB;
    }
}
