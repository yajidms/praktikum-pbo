import java.util.Scanner;

public class StringsDescending
{
  public static void main (String[] args)
  {
    String[] stringList;
    int size;

    Scanner scan = new Scanner(System.in);

    System.out.print ("\nHow many strings do you want to sort? ");
    size = scan.nextInt();
    scan.nextLine();

    stringList = new String[size];

    System.out.println ("\nEnter the strings...");
    for (int i = 0; i < size; i++)
      stringList[i] = scan.nextLine();

    Sorting.insertionSortDescending(stringList);  // diubah descending

    System.out.println ("\nYour strings in descending order...");
    for (int i = 0; i < size; i++)
      System.out.println(stringList[i]);
    System.out.println ();
  }
}