package com.company;

import com.company.Casting.EjemploConversionObjetos;
import com.company.ClaseObject.ClaseObject;
import com.company.ClasesAbstractas.EjemploClasesAbstractas;
import com.company.Colecciones.ManejoColecciones;
import com.company.Constantes.Constantes;
import com.company.EntradaDatos.Calculadora.Calculadora;
import com.company.EntradaDatos.Calculadora.Operaciones;
import com.company.EntradaDatos.EntradaDatos;
import com.company.EntradaDatos.EntradaDatosScanner;
import com.company.Excepciones.ManejoExcepciones1;
import com.company.Excepciones.ManejoExcepcionesArg;
import com.company.Excepciones.OperationException;
import com.company.Genericos.ManejoColeccionesGenercias;
import com.company.Genericos.ManejoGenericos;
import com.company.Interfaces.ManejoInterfaces;
import com.company.ModificadorAcceso.ModificadorAcceso2;
import com.company.ModificadorAcceso.paquete1.ModificadorAcceso3;
import com.company.PropiedadesSistema.PropiedadesSistema;
import com.company.Sobreescritura.Empleado;
import com.company.Sobreescritura.Gerente;
import com.company.Utileria.AccionesArchivos;
import com.company.Utileria.ManejadorArchivos;
import com.company.bloquescodigo.PersonaBloques;
import com.company.enumeraciones.Continentes;
import com.company.enumeraciones.Dias;
import com.company.enumeraciones.EjemploEnumeraciones;
import com.company.instanceof_ejemplo.EjemploInstanceOf;
import com.company.javadoc.Aritmetica;

import java.util.Scanner;

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
        //callModificadorAcceso();2
        //callSobreescritura();
        //callPolimorfismo();
        //callEjemploInstanceOf();
        //callEjemploCating();
        //callClaseObject();
        //callEjemploClaseAbstracta();
        //new ManejoExcepciones1();
//        try {
//            new ManejoExcepcionesArg(args);
//        } catch (OperationException e) {
//            e.printStackTrace();
//        }
        //new ManejoColecciones();
        //new ManejoGenericos();
        //new ManejoColeccionesGenercias();
        //new ManejoInterfaces();
        //new PropiedadesSistema();
        //new EntradaDatos();
        //new EntradaDatosScanner();
        //calculadora();
        archivos();
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

    private static void calculadora() {
        System.out.println("Que operación deseas realizar?");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        Scanner scanner = new Scanner(System.in);
        int operacion = scanner.nextInt();
        System.out.println("Operación seleccionada " + new Calculadora().tipoOperacion(operacion) +"\n");
        System.out.println("Introduce el primer valor");
        int a = scanner.nextInt();
        System.out.println("Introduce el segundo valor");
        int b = scanner.nextInt();
        Operaciones operaciones = new Calculadora(a, b);
        switch (operacion) {
            case 1:
                System.out.println("Resultado " + operaciones.sumar());
                break;
            case 2:
                System.out.println("Resultado " + operaciones.resta());
                break;
            case 3:
                System.out.println("Resultado " + operaciones.multiplica());
                break;
            case 4:
                System.out.println("Resultado " + operaciones.divide());
                break;
        }
    }

    private static void archivos(){
        AccionesArchivos accionesArchivos = new ManejadorArchivos(Constantes.NOMBRE_ARCHIVO);
        accionesArchivos.crearArchivo();
        accionesArchivos.escribirArchivo();
        accionesArchivos.leerArchivo();
        accionesArchivos.anexarArchivo();
        accionesArchivos.leerArchivo();
    }
}
