package com.example.foobar;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
  private final int count = 100;

  public FizzBuzz() {}

  public Map<Integer, String> computeFizzBuzz() {
    var results = new HashMap<Integer, String>();
    for (int i = 1; i <= count; i++) {
      int mod3 = i % 3;
      int mod5 = i % 5;
      if (mod3 == 0 && mod5 == 0) {
        results.put(i, "fizzbuzz");
      } else if (mod3 == 0) {
        results.put(i, "fizz");
      } else if (mod5 == 0) {
        results.put(i, "buzz");
      }
    }

    return results;
  }
}
