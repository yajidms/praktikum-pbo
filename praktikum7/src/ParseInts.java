import java.util.Scanner;

public class ParseInts {
  public static void main(String[] args) {
    int sum = 0;
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a line of text");
    Scanner scanLine = new Scanner(scan.nextLine());

    while (scanLine.hasNext()) {
      String token = scanLine.next();
      try {
        int val = Integer.parseInt(token);
        sum += val;
      } catch (NumberFormatException ex) {
        System.out.println("Ignoring non-integer token: '" + token + "'");
      }
    }

    System.out.println("The sum of the integers on this line is " + sum);
  }
}