package recursion;

public class Fibonacci {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println("Fibonacci de " + i + " = " + getFibonacci(i));
    }
  }

  public static int getFibonacci(int n) {
    if (n == 1) {
      return 1;
    }
    if (n == 0) {
      return 0;
    }

    return getFibonacci(n-1)+getFibonacci(n-2);
  }
}
