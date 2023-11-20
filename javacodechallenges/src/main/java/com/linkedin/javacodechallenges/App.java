package com.linkedin.javacodechallenges;

import java.util.List;

public class App {
    public static double calculateAverageChangeInvested(List<Double> purchases) {
        double result = 0;
        if(purchases.size() == 0) {
            return result;
        }
        for (double purchase : purchases) {
            result += (Math.ceil(purchase) - purchase);
        }
        return result / purchases.size();
    }

    public static void main(String[] args) {
        List<Double> purchases = List.of(12.38, 38.29, 5.27, 3.21);
        System.out.println(calculateAverageChangeInvested(purchases));
    }
}
