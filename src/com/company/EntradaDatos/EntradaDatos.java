package com.company.EntradaDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos {
    String captura;
    InputStreamReader inputStreamReader;
    BufferedReader bufferedReader;

    public EntradaDatos() {
        inputStreamReader = new InputStreamReader(System.in);
        bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Introduce un dato:");
        try {
            captura = bufferedReader.readLine();
            while (captura != null) {
                System.out.println("Dato introducido " + captura);
                captura = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
