// Problem Statement:
// Write a program to find the side of the square whose perimeter you read from the user.

import java.util.Scanner;

public class Level2_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double perimeter;

        System.out.print("Enter the perimeter of the square: ");
        perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);

    }
}