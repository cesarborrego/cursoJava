package com.company.ClasesAbstractas;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    //La clase padre no define comportamiento
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "tipoFigura='" + this.tipoFigura + '\'' +
                '}';
    }
}
