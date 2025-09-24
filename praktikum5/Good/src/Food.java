public class Food extends Goods {
  private int calories;

  public Food(String description, double price, int calories) {
    super(description, price);
    setCalories(calories);
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    if (calories < 0) {
      throw new IllegalArgumentException("calories cannot be negative");
    }
    this.calories = calories;
  }

  @Override
  public void display() {
    System.out.printf(
            "Food{description='%s', calories=%d, price=%.2f}%n",
            getDescription(), getCalories(), getPrice()
    );
  }

  @Override
  public String toString() {
    return String.format(
            "Food{description='%s', calories=%d, price=%.2f}",
            getDescription(), calories, getPrice()
    );
  }
}