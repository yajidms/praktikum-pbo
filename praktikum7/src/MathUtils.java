 public class MathUtils {
  // Returns the factorial of the argument given
  public static int factorial(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException("factorial is undefined for negative integers: " + n);
    }
    if (n > 16) {
      throw new IllegalArgumentException("factorial only defined for 0..16 with int (n=" + n + ")");
    }

    int fac = 1;
    for (int i = n; i > 0; i--) {
      fac *= i;
    }
    return fac;
  }
}