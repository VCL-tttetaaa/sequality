package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2;
    assertEquals(expected, calculate.average(4), 0.0);
  }

  @Test
  public void testSumOfRange() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumOfRange(1, 10));
  }

  @Test
  public void testAverageOfRange() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.averageOfRange(55, 1, 10), 0.0);
  }

  @Test
  public void testSumOfOdd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumOfOdd(1, 10));
  }

  @Test
  public void testSumOfEven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumOfEven(1, 10));
  }

}
