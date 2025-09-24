public class ManagerTest {
  public static void main(String[] args) {
    Manager[] team = new Manager[3];
    team[0] = new Manager("Alice Manager", 5000000, 2, 1, 2015);
    team[1] = new Manager("Bob Manager", 4500000, 15, 6, 2012);
    team[2] = new Manager("Carol Manager", 7000000, 20, 3, 2018);

    Sortable.shell_sort(team);

    for (Manager m : team) {
      m.print();
    }
  }
}
