package com.company.Interfaces;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public interface AccesoDatos {
    public static int MAX_REGISTROS = 10;
    public abstract void insertar();
    public abstract void listar();
}
