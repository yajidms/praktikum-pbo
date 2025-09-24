public class Book extends Goods implements Taxable {
  private String author;

  public Book(String description, double price, String author) {
    super(description, price);
    setAuthor(author);
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    if (author == null) {
      throw new IllegalArgumentException("author cannot be null");
    }
    this.author = author;
  }

  @Override
  public double calculateTax() {
    return getPrice() * TAX_RATE;
  }

  @Override
  public void display() {
    System.out.printf(
            "Book{description='%s', author='%s', price=%.2f, tax=%.2f}%n",
            getDescription(), getAuthor(), getPrice(), calculateTax()
    );
  }

  @Override
  public String toString() {
    return String.format(
            "Book{description='%s', author='%s', price=%.2f}",
            getDescription(), author, getPrice()
    );
  }
}