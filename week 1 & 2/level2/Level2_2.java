// Problem Statement:
// Write a program that takes the base and height in cm to find the area of
// a triangle in square inches and square centimeters.

import java.util.Scanner;

public class Level2_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base, height;

        System.out.print("Enter base in cm: ");
        base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        height = sc.nextDouble();

        double areaCm = 0.5 * base * height;

        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq inches is " + areaInches +
                " and sq cm is " + areaCm);

    }
}