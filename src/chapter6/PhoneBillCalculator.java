package chapter6;

/*
 * Phone Bill Calculator Independent Exercise
 * Calculate the final total of a phone bill
 * Allow the operator to input the plan fee and number of overage minutes
 * Charge the user 0.25 for every minute they were over their plan, and
 * 15% tax on the subtotal.
 * Create separate methods to calculate the tax, overage fees, and final total.
 * Print the itemized bill.
 */

import java.util.Scanner;

public class PhoneBillCalculator {
    // Initialize what we know
    static double overageRate = 0.25;
    static double taxRate = 0.15;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        PhoneBill line1 = new PhoneBill(1);
        line1.setBaseCost(40.99);
        line1.setAllottedMinutes(100);
        line1.setMinutesUsed(180);

        // get what we don't know for line 2

        System.out.println("Enter information for line 2.");

        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter allotted minutes:");
        int allottedMinutes = scanner.nextInt();

        System.out.println("Enter minutes used:");
        int minutesUsed = scanner.nextInt();

        scanner.close();

        PhoneBill line2 = new PhoneBill(2,baseCost,allottedMinutes,minutesUsed);

        line1.calculateTotalAndPrint(overageRate, taxRate);

        line2.calculateTotalAndPrint(overageRate,taxRate);
    }
}
