package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float euro) {
        float result = euro / 70;
        return result;
    }

    public static float rubleToDollar(float dollar) {
        float result = dollar / 60;
        return result;
    }

    public static void main(String[] args) {
        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
