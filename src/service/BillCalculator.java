package service;

public class BillCalculator {

    public static double calculateBill(double units) {

        double ratePerUnit = 8.0;

        return units * ratePerUnit;
    }
}