package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] arg) {

        // 1. ask user to input a season of the year
        System.out.println("Enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. ask user for a whole number
        System.out.println("Enter a whole number: ");
        int wholeNumber = scanner.nextInt();

        // 3. ask user for an adjective
        System.out.println("Enter an adjective: ");
        String adjective = scanner.next();
        scanner.close();

        // 4. print mad lib sentence "On a [adjective] [season of the year] day,
        //    I drink a minimum of [whole number] cups of coffee."
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " +
                wholeNumber + " cups of coffee.");
    }

}
