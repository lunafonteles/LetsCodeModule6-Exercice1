package com.exercicio1;

public class Printer {

    static void printResult(float celsius) {

        float fahrenheit = Calculator.calculaFahrenheit(celsius);
        float kelvin = Calculator.calculaKelvin(celsius);
        float reaumur = Calculator.calculaReamur(celsius);
        float rankine = Calculator.calculaRankine(celsius);

        System.out.printf("C é %.2f \n", celsius);
        System.out.printf("F é %.2f \n", fahrenheit);
        System.out.printf("Re é %.2f \n ", reaumur);
        System.out.printf("K é %.2f \n ", kelvin);
        System.out.printf("Ra é %.2f \n ", rankine);
    }
}
