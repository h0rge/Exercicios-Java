package org.example;

public class StringOperations {
    public String cadea;
    public String subcadea;

    public StringOperations(String cadea, String subcadea) {
        this.cadea = cadea;
        this.subcadea = subcadea;
    }

    public String getCadea() {
        return cadea;
    }

    public void setCadea(String cadea) {
        this.cadea = cadea;
    }

    public String getSubcadea() {
        return subcadea;
    }

    public void setSubcadea(String subcadea) {
        this.subcadea = subcadea;
    }

    // StringBuilder resultado = new StringBuilder(Character.toString(cadea.charAt(0)));
    public static void reverseString(String cadea) {
        String reverseCadea = "";
        int i;
        for (i = cadea.length() - 1; i >= 0; i-=1) {
            reverseCadea += cadea.charAt(i);
        }
        System.out.println(reverseCadea);
    }

    public static void replaceChar(String cadea, char caracter) {
        int i;
        for(i = 0; i < cadea.length(); i++) {


        }
    }
}
