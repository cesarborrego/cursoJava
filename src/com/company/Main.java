package com.company;

import com.company.Casting.EjemploConversionObjetos;
import com.company.ClaseObject.ClaseObject;
import com.company.ClasesAbstractas.EjemploClasesAbstractas;
import com.company.ModificadorAcceso.ModificadorAcceso2;
import com.company.ModificadorAcceso.paquete1.ModificadorAcceso3;
import com.company.Sobreescritura.Empleado;
import com.company.Sobreescritura.Gerente;
import com.company.bloquescodigo.PersonaBloques;
import com.company.enumeraciones.Continentes;
import com.company.enumeraciones.Dias;
import com.company.enumeraciones.EjemploEnumeraciones;
import com.company.instanceof_ejemplo.EjemploInstanceOf;
import com.company.javadoc.Aritmetica;

/**
 * @author Cesar Segura Granados
 * @version 1.0
 */
public class Main {

    /**
     * Metodo que ejecuta la prueba de la clase Aritmetica
     *
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        //callContinentes();
        //callPersonaBloqueCodigo();
        //callAutoboxing();
        //callModificadorAcceso();
        //callSobreescritura();
        //callPolimorfismo();
        //callEjemploInstanceOf();
        //callEjemploCating();
        //callClaseObject();
        callEjemploClaseAbstracta();
    }

    private static void callAritmetica() {
        int resultado = new Aritmetica(3, 2).sumar();
        System.out.println(resultado);
    }

    public static void indicarDias(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("primer dia de la semana");
                break;
            case MARTES:
                System.out.println("segundo dia de la semana");
                break;
            default:
                System.out.println("dia de la semana no valido");
        }
    }

    private static void callContinentes() {
        new EjemploEnumeraciones();
    }

    private static void callPersonaBloqueCodigo() {
        PersonaBloques p1 = new PersonaBloques();
            int id = p1.getIdPersona();
            System.out.println(id);

    }

    private static void callAutoboxing() {
        new AutoBoxingUnboxing();
    }

    private static void callModificadorAcceso() {
        System.out.println("Acceso desde ModificadorAcceso2 a ModificadorAcceso (mismo paquete)");
        new ModificadorAcceso2().pruebaModificadoresAcceso2();

        //Acceso a ModificadorAcceso desde ModificadorAcceso3
        //ModificadorAcceso3 extiende de ModificadorAcceso
        System.out.println("Acceso desde ModificadorAcces3 a ModificadorAcceso (DIFERENTE paquete, pero es SUBCLASE)");
        new ModificadorAcceso3().pruebaDesdeModificadorAcceso3();

        //Acceso a ModificadorAcceso desde ModificadorAcceso4
        //ModificadorAcceso4 no es subclase y esta en otro paquete
        System.out.println("Acceso desde ModificadorAcces4 a ModificadorAcceso (DIFERENTE paquete, NO es SUBCLASE)");
        new ModificadorAcceso3().pruebaDesdeModificadorAcceso3();
    }

    private static void callSobreescritura() {
        Empleado empleado = new Empleado("Juan", 1000);
        System.out.println(empleado.obtenerDetalles());

        Gerente gerente = new Gerente("Karla", 2000, "Finanzas");
        System.out.println(gerente.obtenerDetalles());
    }

    private static void callPolimorfismo() {
        com.company.polimorfismo.Empleado emp = new com.company.polimorfismo.Empleado("juan", 1000);
        imprimirDetalles(emp);

        com.company.polimorfismo.Gerente ger = new com.company.polimorfismo.Gerente("karla", 2000, "finanzas");
        imprimirDetalles(ger);
    }

    private static void imprimirDetalles(com.company.polimorfismo.Empleado emp) {
        System.out.println(emp.obtenerDetalles());
    }

    private static void callEjemploInstanceOf() {
        new EjemploInstanceOf();
    }

    private static void callEjemploCating() {
        new EjemploConversionObjetos();
    }

    private static void callClaseObject() {
        new ClaseObject();
    }

    private static void callEjemploClaseAbstracta() {
        new EjemploClasesAbstractas();
    }
}
