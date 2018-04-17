package com.company.PropiedadesSistema;

import java.util.Enumeration;
import java.util.Properties;

public class PropiedadesSistema {

    public PropiedadesSistema() {
        Properties properties = System.getProperties();
        Enumeration nombrePropiedades = properties.propertyNames();
        while (nombrePropiedades.hasMoreElements()) {
            String nombrePropiedad = (String) nombrePropiedades.nextElement();
            String valorPropiedad = properties.getProperty(nombrePropiedad);
            System.out.println("Llave: " + nombrePropiedad + " = " + valorPropiedad);
        }
    }
}
