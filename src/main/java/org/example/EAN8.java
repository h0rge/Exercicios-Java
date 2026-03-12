package org.example;

import java.sql.SQLOutput;

public class EAN8 {

    private static int calcularDixitoControl(String codigo) {
        int resultado = 0;
        for (int i = 0; i < codigo.length(); i++) {
            int dixito = Character.getNumericValue(codigo.charAt(i));
        }
    }
}
