package recursion;

public class Fatorial {

  public static void main(String[] args) {
    System.out.println(fatorial(1));
    System.out.println(fatorial(0));
    System.out.println(fatorial(6));
  }

  public static int fatorial(int n) {
    if (n == 1 || n == 0) return 1;
    return n*(fatorial(n-1));
  }
}
