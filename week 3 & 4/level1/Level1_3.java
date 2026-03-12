// Write a program to check if the first, second, or third number is the largest.

import java.util.Scanner;

public class Level1_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        number3 = sc.nextInt();

        boolean firstLargest = (number1 > number2 && number1 > number3);
        boolean secondLargest = (number2 > number1 && number2 > number3);
        boolean thirdLargest = (number3 > number1 && number3 > number2);

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

    }
}