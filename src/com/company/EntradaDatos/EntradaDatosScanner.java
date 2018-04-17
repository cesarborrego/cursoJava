package com.company.EntradaDatos;

import java.util.Scanner;

public class EntradaDatosScanner {
    String captura = null;
    Scanner scanner;

    public EntradaDatosScanner() {
        scanner = new Scanner(System.in);
        System.out.println("Introduce un dato:");
        captura = scanner.nextLine();
        while (captura != null) {
            System.out.println("Dato introducido " + captura);
            captura = scanner.nextLine();
        }
    }
}
