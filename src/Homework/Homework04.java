package Homework;

public class Homework04 {
    public static void main(String[] args) {


        /**
         * Q1:
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (NOTE: you CANNOT use length() from String class)
         * Hint: you need to use split() method and length (from Array)
         */

        String country = "USA";
        System.out.println("\nThe name of the country is " + country);

        String[] countrySplit = country.split("");
        System.out.println("\nThe length of the country name is : " + countrySplit.length);




        /**
         * Q2:
         * Print the number of words in the sentence2-value
         */
        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";

        String [] sentence2Split = sentence2.split(" ");
        int numberOfWords = sentence2Split.length;
        System.out.println("\nThe number of words in sentence2 is : " + numberOfWords);




        /**
         * Q3:
         * Create the abbreviation for 4-word sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */
        String sentence3 = "make America great again";
        String [] sentence3Split = sentence3.split(" ");
        String sentence3Abbreviation = sentence3Split[0].substring(0,1) + sentence3Split[1].substring(0,1) + sentence3Split[2].substring(0,1) +sentence3Split[3].substring(0,1);



        System.out.println("\nThe abbreviation for 4-word sentence is '" + sentence3Abbreviation.toUpperCase()+ "'");












    }
}
