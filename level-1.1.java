//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024

class HarryAgeCalculator {

    public static void main(String[] args) {

        // Declare and initialize variables
        String name = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;

        // Calculate age
        int age = currentYear - birthYear;

        // Display result
        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }

}
