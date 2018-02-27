package com.company.Excepciones;

public class ManejoExcepcionesArg {

    public ManejoExcepcionesArg (String args[]) throws OperationException {
        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division division = new Division(op1, op2);
            division.visualizarOperacion();
        } catch (ArrayIndexOutOfBoundsException aie) {
            aie.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (OperationException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Se revizaron todas las excepciones");
        }

    }
}
