// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. 
// Find the average percent mark in PCM

class AveragePCM {
    public static void main(String[] args) {

        // Declare and initialize marks
        String name = "Sam";
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculate average using 3.0 to ensure decimal precision
        double average = (maths + physics + chemistry) / 3.0;

        // Display result
        System.out.println(name + "'s average mark in PCM is " + average);
    }
}