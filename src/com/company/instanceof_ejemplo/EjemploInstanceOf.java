package com.company.instanceof_ejemplo;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public class EjemploInstanceOf {
    FiguraGeometrica figuraGeometrica = new Elipse();

    public EjemploInstanceOf () {
        //Determina solo un tipo el que corresponde con la jerarquia
        determinaTipo(figuraGeometrica);
        //Determina todos los tipos posibles
        System.out.println("\nTodos sus tipos");
        determiaTodosLosTipos(figuraGeometrica);
    }

    private void determiaTodosLosTipos(FiguraGeometrica figuraGeometrica) {
        if(figuraGeometrica instanceof Elipse) {
            //Procesa algo particular de la Elipse
            System.out.println("Es una elipse");
        }
        if(figuraGeometrica instanceof Circulo) {
            //Procesa algo particular del Circulo
            System.out.println("Es un circulo");
        }
        if(figuraGeometrica instanceof FiguraGeometrica) {
            //Procesa algo particular de la FiguraGeometrica
            System.out.println("Es una FiguraGeometrica");
        }
        if(figuraGeometrica instanceof Object) {
            //Procesa algo particular de la clase Object
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontro el tipo");
        }
    }

    private void determinaTipo(FiguraGeometrica figuraGeometrica) {
        if(figuraGeometrica instanceof Elipse) {
            //Procesa algo particular de la Elipse
            System.out.println("Es una elipse");
        } else
        if(figuraGeometrica instanceof Circulo) {
            //Procesa algo particular del Circulo
            System.out.println("Es un circulo");
        } else
        if(figuraGeometrica instanceof FiguraGeometrica) {
            //Procesa algo particular de la FiguraGeometrica
            System.out.println("Es una FiguraGeometrica");
        } else
        if(figuraGeometrica instanceof Object) {
            //Procesa algo particular de la clase Object
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontro el tipo");
        }
    }
}
