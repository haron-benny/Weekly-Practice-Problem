// Problem Statement:
// Write a TemperatureConversion program that takes temperature in Fahrenheit
// as input and converts it to Celsius.
// Formula: (°F − 32) × 5/9 = °C

import java.util.Scanner;

public class Level3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double fahrenheit;

        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5/9;

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

    }
}
