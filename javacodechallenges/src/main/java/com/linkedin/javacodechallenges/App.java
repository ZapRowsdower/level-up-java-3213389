package com.linkedin.javacodechallenges;

public class App {
    public static void main(String[] args) {
        var dude = new Person("Dude", "McBro", 13);
        dude.greet();

        var bill = new Person("Bill", "Steve", 45);
        bill.greet();

        var jane = new Person("Jane", "Doe", 55);
        jane.greet();
    }
}
