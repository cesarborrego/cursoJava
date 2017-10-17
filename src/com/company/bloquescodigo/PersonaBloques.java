package com.company.bloquescodigo;

/**
 * @author Cesar Segura Granados 12,octubre,2017
 * @version 1.0
 */
public class PersonaBloques {
    private final int idPersona;
    private static int contadorPersonas;

    //Bloque de inicializacion estatico
    static {
        contadorPersonas = 10;
        //No se aceptan variables no estaticas
        System.out.println("Ejecuta bloque estatico");
    }

    //Bloque de código para inicializar atributos de la clase
    //El bloque se copia a cada constructor de la clase
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona = ++contadorPersonas;

    }

    public PersonaBloques() {
        System.out.println("Ejecuta constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
}
