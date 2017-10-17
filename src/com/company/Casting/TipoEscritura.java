package com.company.Casting;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");

    private final String descripcion;

    private TipoEscritura (String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
