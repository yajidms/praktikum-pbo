public class Toy extends Goods implements Taxable {
  private int minimumAge;

  public Toy(String description, double price, int minimumAge) {
    super(description, price);
    setMinimumAge(minimumAge);
  }

  public int getMinimumAge() {
    return minimumAge;
  }

  public void setMinimumAge(int minimumAge) {
    if (minimumAge < 0) {
      throw new IllegalArgumentException("minimumAge cannot be negative");
    }
    this.minimumAge = minimumAge;
  }

  @Override
  public double calculateTax() {
    return getPrice() * TAX_RATE;
  }

  @Override
  public void display() {
    System.out.printf(
            "Toy{description='%s', minimumAge=%d, price=%.2f, tax=%.2f}%n",
            getDescription(), getMinimumAge(), getPrice(), calculateTax()
    );
  }

  @Override
  public String toString() {
    return String.format(
            "Toy{description='%s', minimumAge=%d, price=%.2f}",
            getDescription(), minimumAge, getPrice()
    );
  }
}