package Homework;

import java.util.Arrays;

public class Homework06 {

    public static void main(String[] args) {


        /**
         * Q1:
         * Create the abbreviation for sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         * Good morning -> GM
         * Happy new Year -> HNY
         * Happy birthday to you dear -> HBTYD
         * happy new year to you dear -> HNYTYD
         *
         */





        String sentence1 = "outfit of the day";

        String[] sentence1a = sentence1.split(" ");
        String abbreviation = "";
        for ( int i = 0 ; i < sentence1a.length ; i++ ){

            abbreviation += sentence1a[i].charAt(0);
        }

        System.out.println("The Abbrebiation for the sentence1 is : "
                + abbreviation.toUpperCase());




        /**
         * Q2:
         * Change the given sentence in titlecase
         *
         * HappY nEW YEAR to YoU dEAr -> Happy New year To You Dear
         * gooD morNING -> Good Morning
         * make AMERICA GreAT AgAIn -> Make America Great Again
         *
         */


        /**
         * Happy New Year To YOU DEAR
         * happy new year to you dear
         * happy, new, year, to, you, dear
         */




        String sentence2 = "Happy New year To You Dear ";
        String sentence2LowerCase = sentence2.toLowerCase();
        String titleCaseSentence = "";
        String[] sentence2Split = sentence2LowerCase.split(" ");

        for (int i = 0 ; i < sentence2Split.length ; i++){

           sentence2Split[i].charAt(0); // coundnt assign .toUpperCase
           titleCaseSentence += sentence2Split[i] + " ";


        }
        System.out.println("\n" + titleCaseSentence);


        /**
         * Q3:
         * Reverse a String
         *
         * Learn -> Learn
         * Learn More -> More Learn
         * happy birthday to you -> you to birthday happy
         *
         */


        String sentence3 = "learn More ";
        String[] sentence3Split = sentence3.split(" ");
        String sentencereverse = "";
        for (int i = sentence3Split.length-1 ; i >= 0 ; i--) {
            sentencereverse += sentence3Split[i] + " ";
        }

        System.out.println("\nThe reverse of the string sentence3 is : "
                + sentencereverse);


        /**
         * Q4:
         * Find the maximum value from given int-array
         *
         * int[] = {23, 54, 76, 12, 67, 90, 23}     ->  90
         *
         * int[] = {23, 54, 76, 12}     ->  76
         *
         * int[] = {-2, -9, -4, -7, -9, -55}     ->  -2
         */

        int[] numbers = {23, 54, 76, 12, 67, 90, 23};

        int maxValue = numbers[0];

        for ( int i = 0; i < numbers.length; i++ ){


            if (numbers[i] > maxValue) maxValue = numbers[i];


        }


        System.out.println("\nThe maximum value in the array is : " + maxValue);







    }
}
