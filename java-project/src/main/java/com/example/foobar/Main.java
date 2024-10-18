package com.example.foobar;

import java.util.Map;

public class Main {
  public static void main(String[] args) {
    var fizzbuzz = new FizzBuzz();
    Map<Integer, String> results = fizzbuzz.computeFizzBuzz();
    for (int i = 1; i <= 100; i++) {
      String message = results.get(i);
      System.out.println(String.format("%d: %s", i, message != null ? message : ""));
    }
  }
}
