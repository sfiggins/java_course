package chapter5;

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
    static Scanner scanner = new Scanner(System.in);

    // calculate tax method
    private static double calculateTaxCost(double planCost, double overageFee){
        return (planCost + overageFee) * taxRate;
    }

    // calculate overage method
    private static double calculateOverageCost(int overageMinutes){
        return overageMinutes * overageRate;
    }

    // calculate bill total and print.
    private static void calculateAndPrintBIll(double baseCost, double overageCost, double taxFee){

        double finalTotal = baseCost + overageCost +taxFee;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", overageCost));
        System.out.println("Tax: $" + String.format("%.2f", taxFee));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }

    public static void main(String[] args){
        // get what we don't know
        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();

        scanner.close();

        double overageCost = calculateOverageCost(overageMinutes);
        double taxFee = calculateTaxCost(baseCost, overageCost);
        calculateAndPrintBIll(baseCost, overageCost, taxFee );

    }
}
