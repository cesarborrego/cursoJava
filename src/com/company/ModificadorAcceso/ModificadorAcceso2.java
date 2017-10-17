package com.company.ModificadorAcceso;

/**
 * @author Cesar Segura Granados 16,octubre,2017
 * @version 1.0
 */
public class ModificadorAcceso2 {

    public ModificadorAcceso2() {
        System.out.println("");
        new ModificadorAcceso(1);
        new ModificadorAcceso(1, 2);
        new ModificadorAcceso(1, 1, 3);
        System.out.println("Constructor private: Acceso negado");
    }

    public void pruebaModificadoresAcceso2() {
        ModificadorAcceso modificadorAcceso = new ModificadorAcceso();
        System.out.println("");
        System.out.println("Atributo publico:"+modificadorAcceso.atrPublico);
        System.out.println("Atributo protegido:"+modificadorAcceso.atrProtegido);
        System.out.println("Atributo default:"+modificadorAcceso.atrPaquete);
        System.out.println("Atributo privado: Acceso negado");

        System.out.println("");
        System.out.println("Método publico:"+modificadorAcceso.metodoPublico());
        System.out.println("Método protegido:"+modificadorAcceso.metodoProtected());
        System.out.println("Método default:"+modificadorAcceso.metodoPackage());
        System.out.println("Método privado: Acceso negado");
    }
}
