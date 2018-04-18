package com.company.EntradaDatos.Calculadora;

/**
 * Creado por Cesar Segura Granados
 * 17/04/2018
 */
public class Calculadora implements Operaciones {
    int a, b;

    public Calculadora() {
    }

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int sumar() {
        return a + b;
    }

    @Override
    public int resta() {
        return a - b;
    }

    @Override
    public int multiplica() {
        return a * b;
    }

    @Override
    public int divide() {
        return a / b;
    }

    @Override
    public String tipoOperacion(int tipoOperacion) {
        String tipo = null;
        switch (tipoOperacion) {
            case 1:
                tipo = "Suma";
                break;
            case 2:
                tipo = "Resta";
                break;
            case 3:
                tipo = "Multiplicación";
                break;
            case 4:
                tipo = "División";
                break;
        }
        return tipo;
    }
}
