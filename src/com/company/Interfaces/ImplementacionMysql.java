package com.company.Interfaces;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public class ImplementacionMysql implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }
}
