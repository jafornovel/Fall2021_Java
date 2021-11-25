package Midterm;

import java.util.Scanner;

public class Question2 {



    /**
     * Ques-2: Create a method to return the sum of digits in input-int-value
     * points: 20
     */
    /*
     *
     * eg:
     * input -> 123
     * returned value -> 6
     *
     * input -> 323
     * returned array -> 8
     *
     * input -> 90
     * returned array -> 9
     *
     */



    static int sum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input an Integer: ");
        int num = scan.nextInt();
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        return sum;
    }
    public static void main(String[] arg)
    {

        System.out.println("Returned value is: "+sum());
    }



}
