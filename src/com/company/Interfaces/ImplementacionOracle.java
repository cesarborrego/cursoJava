package com.company.Interfaces;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public class ImplementacionOracle implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }
}
