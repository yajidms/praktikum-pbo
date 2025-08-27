import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String A = scanner.next();
    String B = scanner.next();
    scanner.close();

    int totalLength = A.length() + B.length();
    System.out.println(totalLength);

    if (A.compareTo(B) > 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
    String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
    System.out.println(capitalizedA + " " + capitalizedB);
  }
}

/*
1. Sum the lengths of A and B.
Untuk menjumlahkan panjang kedua string, maka bisa menggunakan metode .length() pada
masing-masing string lalu menambahkannya. Dengan input "hello" dan "java" , perhitungannya adalah
A.length() + B.length() atau 5 + 4, yang menghasilkan output 9.
 */

/*
2. Determine if A is lexicographically larger than B (i.e: does B come before A in the dictionary?)
Untuk menentukan apakah string A lebih besar dari B secara urutan kamus (leksikografis), metode .compareTo()
digunakan. Metode ini akan menghasilkan nilai lebih besar dari 0 jika A lebih besar dari B. Dalam kasus "hello"
dibandingkan dengan "java" , hasilnya adalah "No" karena huruf 'h' datang sebelum 'j' di dalam alfabet.
 */

/*
3.Capitalize the first letter in A and B and print them on a single line, separated by a space.
Untuk mengkapitalisasi huruf pertama, kita perlu mengambil karakter pertama dari string (misalnya dengan .substring(0, 1)),
mengubahnya menjadi huruf besar dengan .toUpperCase(), lalu menggabungkannya kembali dengan sisa string (.substring(1)). Proses ini
dilakukan untuk kedua string, dan hasilnya dicetak dalam satu baris. Untuk input "hello" dan "java" , output yang dihasilkan adalah
"Hello Java".
 */