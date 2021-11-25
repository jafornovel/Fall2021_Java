package Midterm;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {




    /**
     * Ques-1: Create a method to return an int-array after sorting an input-int-array
     * points: 10
     */

    /*
     *
     * eg:
     * input -> [32, 54, 12, 67, 2, 5]
     * returned array -> [2, 5, 12, 32, 54, 67]
     *
     * input -> [5, 4, 3, 1, 2]
     * returned array -> [1, 2, 3, 4, 5]
     *
     * input -> [90, 34, 12, 4]
     * returned array -> [4, 12, 34, 90]
     *
     *
     */


    static int[] sort()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of the Array: ");
        int len = scan.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter numbers of the Array one by one: ");
        for(int i = 0; i < len; i++)
        {

            System.out.print((i+1)+ ") Input : ");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        return arr;
    }
    public static void main(String[] arg) {


        // Printing the array after sorting
        System.out.println("Sorted arr[] :" + Arrays.toString(sort()));
    }


}
