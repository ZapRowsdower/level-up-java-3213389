package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class DoubleOrNothing {

  public void playGame() {
    var points = 10;
    var is_playing = true;
    Scanner scanner = new Scanner(System.in);
    while (is_playing) {
      System.out.print("Would you like to double your points? " + points + " y/n ");
      var user_wants_double = scanner.nextLine();
      if (user_wants_double.toLowerCase().trim().equals("n")) {
        System.out.println("Playing it safe? Don't blame you.");
        print_points_balance(points);
        is_playing = false;
      } else if (user_wants_double.toLowerCase().trim().equals("y")) {
        var is_winner = Math.random() > 0.5;
        if (is_winner) {
          points *= 2;
          System.out.println("Success!");
          print_points_balance(points);
        } else {
          System.out.println("Womp womp! You lost it all!");
          points = 0;
          print_points_balance(points);
          is_playing = false;
        }
      } else {
        System.out.println("Please enter \"y\" or \"n\"");
      }
    }
    scanner.close();
  }

  private void print_points_balance(int points) {
    System.out.println("You have " + points + " points.");
  }
}