package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int sum) {
    return (double) sum / 2;
  }

  public int sumOfRange(int start, int end) {
    int total = 0;
    for (int i = start; i <= end; i++) {
      total += i;
    }
    return total;
  }

  public double averageOfRange(int sum, int n1, int n2) {
    int num = n2 - n1 + 1;
    return (double) sum / num;
  }

  public int sumOfOdd(int start, int end) {
    int total = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        total += i;
      }
    }
    return total;
  }

  public int sumOfEven(int start, int end) {
    int total = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        total += i;
      }
    }
    return total;
  }

}
