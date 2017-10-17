package com.company.Casting;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public class Escritor extends Empleado {
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()+" tipo escritura "+tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public String getTipoEscrituraEnTexto() {
        return tipoEscritura.getDescripcion();
    }
}
