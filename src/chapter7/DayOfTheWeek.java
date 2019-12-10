package chapter7;

/*
 * Chapter7 extra example: DayOfTheWeek.
 * Make an array that holds the textual values of the days of the week.
 * Have the user input a number corresponding to the day of the week. Assume the week
 * starts on Monday.
 * Your program should output the String that represents the day of the week.
 * Example: User inputs the number 1, your program should print "Monday"
 */

import java.util.Scanner;

public class DayOfTheWeek {
    private static final String[] DAYSTRINGS = {"Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter a number corresponding to the day of the week (1-7)");
        int dayOfWeek = scanner.nextInt();
        scanner.close();

        System.out.println("That day is: " + DAYSTRINGS[dayOfWeek - 1]);
    }
}
