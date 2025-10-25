import java.util.HashSet;
import java.util.Set;

public class Countries {
  public static void main(String[] args) {
    Set<String> countries = new HashSet<>();

    countries.add("Indonesia");
    countries.add("Japan");
    countries.add("Brazil");
    countries.add("Canada");
    countries.add("Egypt");
    countries.add("Japan");

    System.out.println("isi Set (unik, urutan tidak penting): " + countries);

    boolean addedAgain = countries.add("Japan");
    System.out.println("coba add 'Japan' lagi? " + addedAgain);

    System.out.println("jumlah negara unik: " + countries.size());

    System.out.println("iterasi elemen:");
    for (String c : countries) System.out.println("- " + c);
  }
}