package Final;
import java.util.*;
import java.io.*;
public class Question03 {

    private static void findCommonElement(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {

        String[] arr1 = { "ab", "abcd", "abc", "abcde", "defg", "koli" };

        String[] arr2 = { "abcde", "jhuy", "plot", "koli" };


        System.out.println("Array 1: "
                + Arrays.toString(arr1));

        System.out.println("Array 2: "
                + Arrays.toString(arr2));

        System.out.print("Common Elements: ");

        // Find the common elements
        findCommonElement(arr1, arr2);
    }
}
