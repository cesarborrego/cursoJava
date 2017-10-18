package com.company.ClasesAbstractas;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public class EjemploClasesAbstractas {

    public EjemploClasesAbstractas() {
        //Creacion de objetos
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        FiguraGeometrica circulo = new Circulo("Circulo");

        System.out.println(rectangulo);
        rectangulo.dibujar();

        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();

        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();
    }
}
