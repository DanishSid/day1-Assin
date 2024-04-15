

public class primeno {
  public static void main(String[] args) {
      int N = 25; // input number
      System.out.println("The largest prime digit number less than " + N + " is: " + findLargestPrimeDigitNumber(N));
  }

  private static int findLargestPrimeDigitNumber(int N) {
      int largestPrimeDigitNumber = 0;
      for (int i = N - 1; i >= 2; i--) {
          if (isPrime(i)) {
              largestPrimeDigitNumber = i;
              break;
          }
      }
      return largestPrimeDigitNumber;
  }

  private static boolean isPrime(int number) {
      if (number <= 1) {
          return false;
      }
      for (int i = 2; i <= Math.sqrt(number); i++) {
          if (number % i == 0) {
              return false;
          }
      }
      return true;
  }
}