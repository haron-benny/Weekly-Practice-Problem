// Write a program to check if a number is a natural number
// and find the sum of n natural numbers.

import java.util.Scanner;

public class Level1_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number > 0) {

            int sum = number * (number + 1) / 2;

            System.out.println("The sum of " + number + " natural numbers is " + sum);

        } else {

            System.out.println("The number " + number + " is not a natural number");

        }

    }
}