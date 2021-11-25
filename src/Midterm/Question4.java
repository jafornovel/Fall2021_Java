package Midterm;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {


    /**
     * Ques-4: Create a method to return an int-array after removing input-int-value from an input-int-array
     * points: 40
     */
    /*
     *
     * eg:
     * input -> 23, {23, 54, 67, 12, 34, 23, 56}
     * returned array -> {54, 67, 12, 34, 56}
     *
     * input -> 5, {23, 5, 67, 87, 10, 5, 34, 98, 66}
     * returned array -> {23, 67, 87, 10, 34, 98, 66}
     *
     * input -> 11, {22, 33, 44, 55}
     * returned array -> {22, 33, 44, 55}
     *
     */
    public static void main(String[] args) {

        int [] numbers3 ={23,54,67,12,34,23,56};

        int numberRemove = 23;
        System.out.println(Arrays.toString(remove(numbers3,numberRemove)));
    }


    public static int [] remove (int [] numbers , int  target ) {

        int count = 0;

        for (int number : numbers) {

            if (number == target){

                count++; }

            } if ( count == 0 ){

            return numbers; }

        int [] result = new int[numbers.length-count];

        int index =0;

        for (int value : numbers) {
            if (value !=target){

                result[index] = value;
                index++;
            } }
        numbers = null;
        return result;
    }





}
