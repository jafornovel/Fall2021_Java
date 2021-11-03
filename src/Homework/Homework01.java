package Homework;

public class Homework01 {

    /**  DONE
     *
     * Due: Friday, November 5
     *
     * Store values for below scenario in an appropriate variable, and print the same in Console.
     *  1. number of hours in a day
     *  2. max no. of days in an year
     *  3. total number of employees in an organization
     *  4. Population in a country
     *  5. Mortgage rate
     *  6. Balance in a bank account
     *  7. does the sun rise from the West?
     *  8. Initials of your name (Use: char)    // My initials are DS
     *
     */

    public static void main(String[] args) {


        byte numberOfHoursInAday = 24;
        short maxNumbersOfDaysInAyear = 365;
        int totalNumberOfEmployeesInAnOrganization = 2000;
        long countryPopulation = 329500000;
        double mortgageRate = 4.5;
        double balanceInBank = 656745.4;
        boolean sunRisesFromWest = false;
        char initialOfMyName = 'J' ;

        System.out.println("\n Number of Days in A day is " + numberOfHoursInAday);
        System.out.println("\n Total number of employees in an organization " + totalNumberOfEmployeesInAnOrganization);
        System.out.println("\n Max number of days in an year " + maxNumbersOfDaysInAyear);
        System.out.println("\n Population of United states in 2020 is " + countryPopulation + " people" );
        System.out.println("\n Mortgage rate is : " + mortgageRate + " percentage");
        System.out.println("\n Balance in a bank account is $ " + balanceInBank);
        System.out.println("\n Does the sun rise from the west? : " + sunRisesFromWest);
        System.out.println("\n First initial of my name is : " + initialOfMyName);


    }
}
