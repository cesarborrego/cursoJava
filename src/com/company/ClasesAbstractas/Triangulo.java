package com.company.ClasesAbstractas;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public class Triangulo extends FiguraGeometrica {

    public Triangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        //Comportamiento de la subclase
        System.out.println("Aqui se deberia dibujar un "+this.getClass().getSimpleName());
    }
}
