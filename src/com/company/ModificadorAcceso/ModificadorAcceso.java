package com.company.ModificadorAcceso;

/**
 * @author Cesar Segura Granados 16,octubre,2017
 * @version 1.0
 */
public class ModificadorAcceso {
    public int atrPublico = 5;
    protected int atrProtegido = 6;
    int atrPaquete = 7;
    private int atrPrivado = 8;

    public ModificadorAcceso() {

    }

    public ModificadorAcceso(int i) {
        System.out.println("Constructor publico 1");
    }

    protected ModificadorAcceso(int i, int j) {
        System.out.println("Constructor protected 2");
    }

    ModificadorAcceso(int i, int j, int k) {
        System.out.println("Constructor package 3");
    }

    private ModificadorAcceso(int i, int j, int k, int l) {
        System.out.println("Constructor private 4");
    }

    public int metodoPublico() {
        return 9;
    }

    protected int metodoProtected() {
        return 10;
    }

    int metodoPackage() {
        return 11;
    }

    private int metodoPrivado() {
        return 12;
    }
}
