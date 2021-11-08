package Homework;

public class Homework03 {

    public static void main(String[] args) {

        // Due Date: Nov 7
        /**
         * Store 100 in result 1 if the length of sentence1 is greater then or equal to 10
         * else store 150 in result1.
         *
         * use: Ternary operator
         *
         */

        String sentence1 = "Hello dear, how are you doing?";
        int result1 = 0;
        result1 = sentence1.length()>= 10 ? 100 : 150;
        System.out.println("\nresult1 = " + result1);




        /**
         * replace all instances of a/A with Z
         */
        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        sentence2 = sentence2.toUpperCase();
        String sentence2Replace = sentence2.replace("A","Z");
        System.out.println("\n" + sentence2Replace);




        /**
         * Print
         *  1. the length of the sentence3-value.
         *  2. result if the sentence3 starts with "health" (ignoring cases)
         *  3. result if the sentence3 contains "Body" (ignoring cases)
         *  4. index of "Body" in sentence3
         */
        String sentence3 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        System.out.println("\n\nThe length of sentence3 is: " + sentence3.length());

        sentence3 = sentence3.toLowerCase();
        boolean sentence3StartsWith = sentence3.startsWith("health");
        System.out.println("\nThe sentence3 starts with 'health' : " + sentence3StartsWith);

        String sentence3Contains = "Body".toLowerCase();
       boolean sentence3ContainsBody = sentence3.contains(sentence3Contains);
        System.out.println("\nThe sentence3 contains 'Body' : "+ sentence3ContainsBody);

        int indexOfBody = sentence3.indexOf(sentence3Contains);
        System.out.println("\nIndex of 'Body' in sentence3 is : " + indexOfBody);






    }
}
