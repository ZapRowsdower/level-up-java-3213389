package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {
    private static int one_ccf_in_gallons = 748;
    private static double dollar_per_ccf = 9.42;
    private static double min_charge = 18.84;
    private static double overcharge_threshold = 2;
    private static double overcharge_amt = 3.90;

    public static double calculateWaterBill(double gallonsUsage) {
        var convert_gallons_to_ccf = gallonsUsage / one_ccf_in_gallons;
        var whole_ccf = Math.ceil(convert_gallons_to_ccf);
        var result = 0.0;
        if ((convert_gallons_to_ccf) <= 2) {
            result = min_charge;
        } else if ((convert_gallons_to_ccf > 2)) {
            result = min_charge + (overcharge_amt * (whole_ccf - overcharge_threshold));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
