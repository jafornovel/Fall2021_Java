package Homework;

public class Homework02 {

    public static void main(String[] args) {

        /**  DONE
         *
         * Due: Friday, November 5
         *
         *
         * Refer for formula : https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * F -> C
         * F -> K
         *
         * C -> F
         * C -> K
         *
         * K -> C
         * K -> F
         *
         */

        double fTemp = 88;
        double fToC = (fTemp -32) / 1.8;
        double fToK =(fTemp + 459.67 ) / 1.8;
        System.out.println("\n\nThe temperature in Celsius from Fahrenheit is : " + fToC);
        System.out.println("The temperature in Kelvin from Fahrenheit is : " + fToK);




        double cTemp = 66.8;
        double cToF = cTemp * 1.8 + 32;
        double cToK = cTemp + 273.15;
        System.out.println("\n\nThe temperature in Fahrenheit is : "+ cToF);
        System.out.println("The temperature in Kelvin from Celsius is : " + cToK);




        double kTemp = 570.00;
        double kToC = kTemp - 273.15;
        double kToF =(kTemp / 1.8) - 459.67;
        System.out.println("\n\nThe temperature in Celsius from Kelvin is : " + kToC);
        System.out.println("The temperature in Fahrenheit from Kelvin is : " + kToF);















    }
}
