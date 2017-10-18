package com.company.ClaseObject;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public class ClaseObject {

    Empleado emp = new Empleado("cesar", 1000);
    Empleado emp1 = new Empleado("cesaar", 1000);

    public ClaseObject() {
        compararObjetos(emp, emp1);
    }

    private void compararObjetos(Empleado emp, Empleado emp1) {
        //Lama a metodo toString
        //Por default se manda llamar el metodo toString dentro de println
        System.out.println("Contenido objeto "+emp);

        //Revision por referencia
        if(emp == emp1) {
            System.out.println("Los objetos tienen misma direccion de memoria");
        } else {
            System.out.println("Los objetos tienen diferente direccion de memoria");
        }

        //Revision por el metodo equals
        if(emp.equals(emp1)) {
            System.out.println("Los objetos tienen el mismo contenido, son iguales");
        } else {
            System.out.println("Los objetos NO tienen el mismo contenido, son diferentes");
        }

        //Revision por el metodo equals
        if(emp.hashCode() == emp1.hashCode()) {
            System.out.println("Los objetos tienen el mismo codigo HASH, son iguales");
        } else {
            System.out.println("Los objetos NO tienen el mismo codigo HASH, son diferentes");
        }
    }
}
