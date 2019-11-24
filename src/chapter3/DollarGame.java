package chapter3;

import java.util.Scanner;

/*
 * Dollar Game
 * A chapter 3 extra credit. The objective of the game is to enter enough
 * change to equal exactly $1! Ask a user to enter the quantities for the
 * following coins: pennies, nickels, dimes and quarters. Your program should
 * count up the value of all the change. If it's exactly $1, they win! If it's
 * more than $1, tell them by how much they went over. If it's less than $1,
 * tell them by how much they went under. Feel free to change the game for
 * your country's currency.
 */
public class DollarGame {

    public static void main(String[] arg){
        // Initialize the known value.
        int dollarValue = 100;
        int total;
        int difference;

        // Get values we don't know.
        System.out.println("Let's make a dollar in change!");
        System.out.println();
        System.out.println("How many pennies?:");
        Scanner scanner = new Scanner(System.in);
        total = scanner.nextInt();

        System.out.println("How many nickels?:");
        total = total + scanner.nextInt() * 5;

        System.out.println("How many dimes?:");
        total = total + scanner.nextInt() * 10;

        System.out.println("How many quarters?:");
        total = total + scanner.nextInt() * 25;

        scanner.close();

        // Calculate if we have one, or if not by how much we are off
        if(total > dollarValue){
            difference = total - dollarValue;
            System.out.println("Sorry, you went over by "
                    + difference + " pennies.");
        }
        else if(total < dollarValue){
            difference = dollarValue - total;
            System.out.println("Sorry, you were under by "
                    + difference + " pennies.");
        }
        else{
            System.out.println("Congratulations! You have exactly $1 in change!");
    }






    }
}
