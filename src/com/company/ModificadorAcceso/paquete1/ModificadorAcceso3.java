package com.company.ModificadorAcceso.paquete1;

import com.company.ModificadorAcceso.ModificadorAcceso;

/**
 * @author Cesar Segura Granados 16,octubre,2017
 * @version 1.0
 */
public class ModificadorAcceso3 extends ModificadorAcceso{

    public ModificadorAcceso3() {
        super(1, 2);
    }

    public void pruebaDesdeModificadorAcceso3() {
        ModificadorAcceso modificadorAcceso = new ModificadorAcceso();
        System.out.println("");
        System.out.println("Atributo publico:"+modificadorAcceso.atrPublico+" o heredado "+atrPublico);
        System.out.println("Atributo protegido (heredado):"+atrProtegido);
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo privado: Acceso negado");

        //Constructor publico
        new ModificadorAcceso();
        //Los demas contructores no se pueden probar asi, sino desde el contructor de esta clase
        // ya que es una subclase desde otro paquete
        System.out.println("");
        System.out.println("Método publico:"+modificadorAcceso.metodoPublico());
        System.out.println("Método protegido (heredado):"+metodoProtected());
        System.out.println("Método default: No se puede acceder desde un paquete externo");
        System.out.println("Método privado: Acceso negado");
    }
}
