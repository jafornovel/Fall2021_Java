package Final;
import java.util.Scanner;
public class Question02 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // create a scanner object
        System.out.println("Enter a number for find factorial");
        int num = scan.nextInt();
        factorial(num);
    }

    static void factorial(int num)
    {
        int i, f = 1;
        for (i = 1; i <= num; i++) {
            f = f * i;
        }
        System.out.print("Factorial of the given input  is " + f);

    }
}



