public class Rectangle extends Shape
{
  private double length;  // length in feet
  private double width;   // width in feet

  public Rectangle (double l, double w)
  {
    super("Rectangle");
    length = l;
    width = w;
  }

  public double area()
  {
    return length * width;
  }

  public String toString()
  {
    return super.toString() + " of length " + length +
            " and width " + width;
  }
}