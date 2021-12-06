package com.exercicio1;

import java.util.Scanner;

public class Reader {

    static float celsiusReader() {
        Scanner scanCelsius = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        float celsius = scanCelsius.nextFloat();
        return celsius;
    }


}
