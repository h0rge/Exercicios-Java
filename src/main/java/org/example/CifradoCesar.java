package org.example;

public class CifradoCesar {
    private final static int LONXITUDE_ALFABETO = 'Z' - 'A' + 1;

    public static String cifrado(String mensaxeClar, int desprazamento) {
        StringBuilder resultado = new StringBuilder();
        System.out.println(desprazamento % LONXITUDE_ALFABETO);
        return("I");
    }
}
