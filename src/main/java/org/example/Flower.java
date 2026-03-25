package org.example;
import java.util.Arrays;
public class Flower {
    private static String[] COLORS = {"red", "blue", "pink", "white", "yellow", "purple"};
    private static String[] TYPES = {"lily", "rose", "daisy", "tulip"};
    private String color;
    private String type;

    public Flower(String color, String type) {
        if (isValid(type, TYPES) && isValid(color, COLORS)) {
            this.color = color;
            this.type = type;
        }
    }

    private boolean isValid(String value, String[] list) {
        return Arrays.asList(list).contains(value);
    }

    @Override
    public String toString() {
        return "Flower: " + color + " " + type;
    }
}
