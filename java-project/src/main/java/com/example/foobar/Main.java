package com.example.foobar;

import java.util.Map;

public class Main {
  public static void main(String[] args) {
    if (args.length < 0) {
      System.out.println("Please give a number.");
      return;
    }

    int count;
    try {
      count = Integer.parseInt(args[0]);
      if (count <= 0 || count >= 1_000_000) {
        System.out.println("Invalid number.");
        return;
      }
    } catch (NumberFormatException e) {
      System.out.println("Argument " + args[0] + " is not a number.");
      return;
    }

    var fizzbuzz = new FizzBuzz(count);
    Map<Integer, String> results = fizzbuzz.computeFizzBuzz();
    for (int i = 1; i <= count; i++) {
      String message = results.get(i);
      System.out.println(String.format("%d: %s", i, message != null ? message : ""));
    }
  }
}
