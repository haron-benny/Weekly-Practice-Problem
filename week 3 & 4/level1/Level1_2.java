// Write a program to check if the first number is the smallest of the three numbers.

import java.util.Scanner;

public class Level1_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        number3 = sc.nextInt();

        boolean isSmallest = (number1 < number2 && number1 < number3);

        System.out.println("Is the first number the smallest? " + isSmallest);

    }
}