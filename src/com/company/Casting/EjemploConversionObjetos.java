package com.company.Casting;

/**
 * @author Cesar Segura Granados 17,octubre,2017
 * @version 1.0
 */
public class EjemploConversionObjetos {
    //Objeto de mas alta jerarquia
    Empleado empleado;
    
    public EjemploConversionObjetos() {
        //Asignamos referencia a objeto de menor jerarquia
        //Esto es un pucasting y no hay necesidad de una notacion especial
        empleado = new Escritor("Cesar", 1000, TipoEscritura.CLASICO);

        //Sin embargo si queremos acceder al detalle de la clase escritor no es posible
        //ya que esas caracteristicas no estan en comun entre todas las clases de la jerarquia de clases
        //empleado.getTipoEscrituraEnTexto();

        //Se imprimen detalles en un metodo generico
        imprimirDetalles(empleado);

        //Se puede hacer lo mismo con la clase gerente
        //Esto es upcasting, por lo que no requiere una notacion especial
        empleado = new Gerente("Patsy", 3000, "Psicologia");

        //pero si queremos acceder directo por la variable empleado al detalle del objeto Gerente
        //NO ES POSIBLE, se pierde el acceso a empleado.getDepartamento();

        //utilizamos el mismo metodo para imprimir los detalles
        imprimirDetalles(empleado);
    }

    private void imprimirDetalles(Empleado empleado) {
        String resultado = null;
        //imprimir detalles es igual para todos ya que es polimorfismo
        //no se necesita ninguna conversion
        System.out.println("\nDetalle "+empleado.obtenerDetalles());
        //Pero los detalles de cada clase se tiene que realizar un downcasting
        if(empleado instanceof Escritor) {
            //Se convierte el objeto al tipo inferior deseado
            //Downcasting
            Escritor  escritor = (Escritor) empleado;
            //Finalmente se accede a los metodos de la clase escritor
            resultado = escritor.getTipoEscrituraEnTexto();

            //Otra forma es hacer la conversion en la misma linea de codigo
            //para evitar la creacion de variables inneecesarias
            resultado = ((Escritor)empleado).tipoEscritura.getDescripcion();
            System.out.println("resultado tipo escritura "+resultado);
        } else if(empleado instanceof Gerente) {
            //Hacemos el downcasting
            resultado = ((Gerente)empleado).getDepartamento();
            System.out.println("resultado departamento "+resultado);
        }
    }

}
