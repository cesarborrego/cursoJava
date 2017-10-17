package com.company.ModificadorAcceso.paquete1;

import com.company.ModificadorAcceso.ModificadorAcceso;

/**
 * @author Cesar Segura Granados 16,octubre,2017
 * @version 1.0
 */
public class ModificadorAcceso4 {

    public ModificadorAcceso4() {
        //Constructor protegigo, restringido al no ser una subclase
        //super(1,2);
        //Acceso package, y al estar fuera del paquete esta restringido
        //super(1,2,3)
        //Acceso privado restringido
        //super(1,2,3,4)
    }

    public void pruebaDesdeModificadorAcceso4() {
        ModificadorAcceso modificadorAcceso = new ModificadorAcceso();
        System.out.println("");
        System.out.println("Atributo publico:"+modificadorAcceso.atrPublico);
        System.out.println("Atributo protegido: No se puede acceder desde un paquete externo al NO ser una subclase");
        System.out.println("Método default: No se puede acceder desde un paquete externo");
        System.out.println("Método privado: Acceso negado");

        System.out.println("");
        System.out.println("Método publico:"+modificadorAcceso.metodoPublico());
        System.out.println("Método protegido: No se puede acceder desde un paquete externo al NO ser una subclase");
        System.out.println("Método default: No se puede acceder desde un paquete externo");
        System.out.println("Método privado: Acceso negado");
    }
}
