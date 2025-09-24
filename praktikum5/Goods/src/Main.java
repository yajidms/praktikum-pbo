public class Main {
  public static void main(String[] args) {
    Goods g = new Goods("Generic item", 10.00);
    Food f = new Food("Apple", 1.50, 95);
    Toy t = new Toy("Lego Set", 29.99, 6);
    Book b = new Book("Clean Code", 45.00, "Robert C. Martin");

    g.display();
    f.display();
    t.display();
    b.display();
  }
}