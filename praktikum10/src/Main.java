import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class Main {
  public static void main(String[] args) {
    // arraylist
    List<Student> students = new ArrayList<>();
    students.add(new Student("S001", "jarvis", "DPR", 40));
    students.add(new Student("S002", "sahroni", "DPR", 10));
    students.add(new Student("S003", "bahlil", "DPR", 30));
    students.add(new Student("S004", "mulyani", "DPR", 20));
    students.add(new Student("S005", "andi", "Bandung", 40));

    students.sort(Comparator.comparing(Student::getName));

    System.out.println("ArrayList (sorted by name):");
    for (Student s : students) {
      System.out.println(s);
    }

    // vector
    Vector<Student> vec = new Vector<>();
    vec.add(new Student("V001", "dzikri", "mojokerto", 10));
    vec.add(new Student("V002", "civicdici", "ngawi", 10));
    vec.add(new Student("V003", "person", "surabaya", 20));
    vec.add(new Student("V004", "person", "semarang", 30));
    vec.add(new Student("V005", "person", "depok", 40));

    System.out.println("\nStudents in Computer Science department:");
    for (Student s : vec) {
      if (s.getDepartmentName().equalsIgnoreCase("Computer Science")) {
        System.out.println(s);
      }
    }
  }
}
