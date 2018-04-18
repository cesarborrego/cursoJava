package com.company.Interfaces;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public class ManejoInterfaces {
    public ManejoInterfaces() {
        AccesoDatos accesoDatos = new ImplementacionOracle();
        ejecutar(accesoDatos, "listar");

        accesoDatos = new ImplementacionMysql();
        ejecutar(accesoDatos, "insertar");
    }

    private void ejecutar(AccesoDatos accesoDatos, String s) {
        if(s.equals("listar")) {
            accesoDatos.listar();
        } else if(s.equals("insertar")) {
            accesoDatos.insertar();
        }
    }
}
