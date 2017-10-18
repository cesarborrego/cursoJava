package com.company.ClaseObject;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public class Empleado {
    private String nombre;
    private double sueldo;

    Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;

        Empleado empleado = (Empleado) o;

        if (Double.compare(empleado.getSueldo(), getSueldo()) != 0) return false;
        return getNombre().equals(empleado.getNombre());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getNombre().hashCode();
        temp = Double.doubleToLongBits(getSueldo());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
