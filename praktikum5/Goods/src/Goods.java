public class Goods {
  private String description;
  private double price;

  public Goods() {
    this("", 0.0);
  }

  public Goods(String description, double price) {
    setDescription(description);
    setPrice(price);
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    if (description == null) {
      throw new IllegalArgumentException("description cannot be null");
    }
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price < 0) {
      throw new IllegalArgumentException("price cannot be negative");
    }
    this.price = price;
  }

  public void display() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return String.format("Goods{description='%s', price=%.2f}", description, price);
  }
}