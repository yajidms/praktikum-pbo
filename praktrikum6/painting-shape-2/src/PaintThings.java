import java.text.DecimalFormat;

public class PaintThings
{
  public static void main (String[] args)
  {
    final double COVERAGE = 350;
    Paint paint = new Paint(COVERAGE);

    Rectangle deck;
    Sphere bigBall;
    Cylinder tank;

    double deckAmt, ballAmt, tankAmt;

    // instantiate the three shapes to paint
    deck = new Rectangle(20, 35);         // 20 x 35 foot rectangle
    bigBall = new Sphere(15);             // sphere of radius 15
    tank = new Cylinder(10, 30);          // cylinder radius 10, height 30

    // compute the amount of paint needed for each shape
    deckAmt = paint.amount(deck);
    ballAmt = paint.amount(bigBall);
    tankAmt = paint.amount(tank);

    // print the amount of paint for each
    DecimalFormat fmt = new DecimalFormat("0.#");
    System.out.println("\nNumber of gallons of paint needed...");
    System.out.println("Deck: " + fmt.format(deckAmt));
    System.out.println("Big Ball: " + fmt.format(ballAmt));
    System.out.println("Tank: " + fmt.format(tankAmt));
  }
}