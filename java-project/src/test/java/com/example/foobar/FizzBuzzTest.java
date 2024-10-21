package com.example.foobar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
  @Test
  public void test() {
    var fizzbuzz = new FizzBuzz(15);
    Map<Integer, String> results = fizzbuzz.computeFizzBuzz();

    assertEquals(null, results.get(1));
    assertEquals("fizz", results.get(3));
    assertEquals("buzz", results.get(5));
    assertEquals("fizzbuzz", results.get(15));
  }

  @Test
  public void testCount() {
    var fizzbuzz = new FizzBuzz(5);
    Map<Integer, String> results = fizzbuzz.computeFizzBuzz();

    assertEquals(null, results.get(1));
    assertEquals("fizz", results.get(3));
    assertEquals("buzz", results.get(5));
    assertEquals(null, results.get(15));
  }
}
