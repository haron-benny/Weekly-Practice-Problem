// Problem Statement:
// Write a TemperatureConversion program that takes temperature in Celsius
// as input and converts it to Fahrenheit.
// Formula: (°C × 9/5) + 32 = °F

import java.util.Scanner;

public class Level3_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius;

        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();

        double fahrenheitResult = (celsius * 9/5) + 32;

        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

    }
}