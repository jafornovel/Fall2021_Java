package Midterm;

import java.util.Scanner;

public class Question3 {


    /**
     * Ques-3: Create a method to print the common Strings in two input-String-arrays
     * points: 30
     * Note: two input-String-arrays can be of same size or different size
     */
    /*
     *
     * eg:
     * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
     * Method should print ->
     * happy
     * peace
     *
     * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
     * Method should print ->
     * abcde
     * koli
     *
     */

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of the Array1:- ");


        int len1 = scan.nextInt();
        String[] arr1 = new String[len1];
        System.out.println("Enter Elements of the Array one by one:- ");
        scan.nextLine();


    }


}
