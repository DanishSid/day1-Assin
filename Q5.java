public class Main {
  public static void main(String[] args) {
      int n = 10; // You can change this value to any number you want
      System.out.println("The smallest number divisible by all numbers between 1 and " + n + " is: " + findSmallestDivisibleNumber(n));
  }

  private static int findSmallestDivisibleNumber(int n) {
      int result = 1;
      for (int i = 1; i <= n; i++) {
          result = lcm(result, i);
      }
      return result;
  }

  private static int lcm(int a, int b) {
      return (a * b) / gcd(a, b);
  }

  private static int gcd(int a, int b) {
      if (b == 0) {
          return a;
      }
      return gcd(b, a % b);
  }
}