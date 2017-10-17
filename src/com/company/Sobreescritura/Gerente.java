package com.company.Sobreescritura;

/**
 * @author Cesar Segura Granados 16,octubre,2017
 * @version 1.0
 */
public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String obtenerDetalles() {
        return "Nombre "+nombre+" , sueldo "+sueldo+ ", departamento "+departamento;
    }
}
