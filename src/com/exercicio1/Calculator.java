package com.exercicio1;

public class Calculator {

    static final float CALC_FAHRENHEIT = 1.8f;
    static final float CALC_KELVIN = 273.15f;
    static final float CALC_REAUMUR = 0.8f;
    static final float CALC_RANKINE = 491f;

    static float calculaFahrenheit(float celsius) {
        float fahrenheit = (celsius * CALC_FAHRENHEIT) + 32f;
        return fahrenheit;
    }

    static float calculaReamur(float celsius) {
        float reaumur = celsius * CALC_REAUMUR;
        return reaumur;
    }

    static float calculaKelvin(float celsius) {
        float kelvin = celsius + CALC_KELVIN;
        return kelvin;
    }
    static float calculaRankine(float celsius) {
        float rankine = (celsius * CALC_FAHRENHEIT) + CALC_RANKINE;
        return rankine;
    }

}
