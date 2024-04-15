public class Main {
  public static void main(String[] args) {
      int num = 12345;
      System.out.println("Original Number: " + num);
      int firstDigit = num % 10;
      int tempNum = num;
      while (tempNum >= 10) {
          tempNum /= 10;
      }
      int lastDigit = tempNum;
      int swappedNum = lastDigit * (int)Math.pow(10, (int)Math.log10(num)) + (num % (int)Math.pow(10, (int)Math.log10(num/10))) + firstDigit;
      System.out.println("Number after swapping first and last digits: " + swappedNum);
  }
}