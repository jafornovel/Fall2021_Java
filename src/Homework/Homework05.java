package Homework;

public class Homework05 {
    public static void main(String[] args) {



        /**
         * Create an int variable and store any value in it.
         * if the number is divisible by 5, print "divisible by 5"
         * if the number is divisible by 3, print "divisible by 3"
         * if the number is divisible by 5 and by 3, print "divisible by 5 and 3"
         * if the number is NOT divisible by 5, 3, or 15, print the value in int-variable
         *
         * int num = 45
         */



        int num = 15;

        if ( num % 5 == 0){
            System.out.println( "\nDivisible by 5 ");
        }else if ( num % 3 == 0){
            System.out.println( "\nDivisible by 3 ");
        }else if (num % 5 == 0 && num % 3 == 0){
            System.out.println("\nDivisible by 5 and 3");
        }else {
            System.out.println("\n" + num);
        }




        /**
         * Create two variable, one to store student-score and another to store the max-score.
         * If student-score is NOT valid, print error statement, "Invalid student score entered"
         *
         * based on the student scoring percentage, print the grade.
         *
         * Grade-A: 91-100%
         * Grade-B: 81-90.99%
         * Grade-C: 71-80.99%
         * Grade-D: 61-70.00%
         * Grade-E: less than 61
         *
         * (double) myScore = 180
         * (int) maxScore = 200
         *
         * (180/200)*100
         *
         */


        int myScore = 180;
        int maxScore = 200;
        double myGradePercentage = (myScore * 100) / maxScore ;

        if ( myGradePercentage >= 91 && myGradePercentage <= 100) {
            System.out.println("\nMy Grade is A");

        } else if ( myGradePercentage >= 81 && myGradePercentage <= 90.99) {
            System.out.println("\nMy Grade is B");

        }else if ( myGradePercentage >= 71 && myGradePercentage <= 80.99) {
            System.out.println("\nMy Grade is C");

        }else if ( myGradePercentage >= 61 && myGradePercentage <= 70) {
            System.out.println("\nMy Grade is D");

        }else  {
            System.out.println("\nMy Grade is E");


        }





    }
}

