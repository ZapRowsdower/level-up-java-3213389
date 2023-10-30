package com.linkedin.javacodechallenges;

import java.util.Date;

public class App {
    // Create function to calculate the date that's
    // 100 days from now

    public static void main(String[] args) {
        System.out.println("100 days from now is... " + oneHundredDays(new Date()));
    }

    public static String oneHundredDays(Date today) {
        var ms_in_day = 8.64e7;
        long one_hundred_in_future = today.getTime() + (long) (ms_in_day * 100);
        return new Date(one_hundred_in_future).toString();
    }
}
