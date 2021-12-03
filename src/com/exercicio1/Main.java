package com.exercicio1;

public class Main {
    public static void main(String[] args) {
        float celsius = 18f;
        final float fahrenheit = (celsius * 1.8f) + 32f;
        final float kelvin = celsius + 273.15f;
        final float reaumur = celsius * 0.8f;
        final float rankine = (celsius * 1.8f) + 491f;

        System.out.printf("C é %.2f \n", celsius);
        System.out.printf("F é %.2f \n", fahrenheit);
        System.out.printf("Re é %.2f \n ", reaumur);
        System.out.printf("K é %.2f \n ", kelvin);
        System.out.printf("Ra é %.2f \n ", rankine);
    }
}