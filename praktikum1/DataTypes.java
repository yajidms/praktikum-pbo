import java.util.Scanner;

public class DataTypes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCases = scanner.nextInt();

    for (int i = 0; i < testCases; i++) {
      try {
        long n = scanner.nextLong();
        System.out.println(n + " can be fitted in:");

        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
          System.out.println("* byte");
        }
        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
          System.out.println("* short");
        }
        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
          System.out.println("* int");
        }
        if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
          System.out.println("* long");
        }
      } catch (Exception e) {
        System.out.println(scanner.next() + " can't be fitted anywhere.");
      }
    }
    scanner.close();
  }
}

/*
Program pertama-tama membaca jumlah kasus uji, n. Kemudian, program melakukan perulangan sebanyak n kali.
Di setiap perulangan, program membaca angka input sebagai String untuk menangani nilai yang sangat besar yang
mungkin tidak muat bahkan di dalam tipe long. Blok try-catch digunakan untuk menangani potensi NumberFormatException
jika input terlalu besar.

Jika angkanya valid, program akan memeriksa nilainya terhadap rentang yang ditentukan oleh Byte.MIN_VALUE,
Byte.MAX_VALUE, Short.MIN_VALUE, Short.MAX_VALUE, dan seterusnya. Kemudian, program akan mencetak semua tipe
data yang dapat menampung angka tersebut, diurutkan berdasarkan ukurannya.
 */