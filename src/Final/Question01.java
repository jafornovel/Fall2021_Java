package Final;

public class Question01 {

    public static void main(String args[]) {
        int array[] = new int[] { 32, 54, 12, 67, 2, 5 };
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

}
