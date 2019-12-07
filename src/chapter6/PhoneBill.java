package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill() {
        id = 0;
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
    }

    public PhoneBill(int id) {
        this.id = id;
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    // getters and setters

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public int getMinutesUsed(int minutesUsed) {
        return minutesUsed;
    }


    private double calculateOverage(double overageRate) {
        if (minutesUsed > allottedMinutes) {
            return (minutesUsed - allottedMinutes) * overageRate;
        }
        return 0;
    }

    private double calculateTax(double overageFee, double taxRate){
        return (baseCost + overageFee) * taxRate;
    }

    public void calculateTotalAndPrint(double overageRate, double taxRate){
        double overageFee =  calculateOverage(overageRate);
        double taxFee = calculateTax(overageFee, taxRate);
        double finalTotal = (baseCost + overageFee + taxFee);

        System.out.println("Phone Bill Statement for ID: " + id);
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", overageFee));
        System.out.println("Tax: $" + String.format("%.2f", taxFee));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}
