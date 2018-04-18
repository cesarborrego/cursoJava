package com.company.Utileria;

import com.company.Interfaces.ManejoInterfaces;

import java.io.*;

/**
 * Creado por
 *
 * @author Cesar Segura Granados
 * 17/04/2018
 * @version 1.0
 */
public class ManejadorArchivos implements AccionesArchivos {
    String nombreArchivo = null;
    File archivo = null;

    public ManejadorArchivos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void crearArchivo() {
        try {
            archivo = new File(nombreArchivo);
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo se ha creado correctamente\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void escribirArchivo() {
        archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            String contenido = "Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente el archivo\n5");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void leerArchivo() {
        archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("Lectura " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void anexarArchivo() {
        archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "Anexando información al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de anexar");
            salida.close();
            System.out.println("Se ha anexado la información correctamente\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
