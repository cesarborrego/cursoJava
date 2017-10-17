package com.company.Casting;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //Sobreescribimos el metodo heredado
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()+", departamento "+departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
