public class Constant2 {
  public static final double CM_PER_INCH = 2.54;

  public static void main(String[] args) {
    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
  }
}

/*
1. Bagaimana output dari masing masing class Constants dan Constants2?
Kedua  kode yaitu Constants sama Constants2, sebenarnya memiliki syntax error
sehingga tidak akan bisa dijalankan sebagaimana mestinya. Kesalahan utamanya adalah nama variabel
CM PER INCH yang tidak valid karena mengandung spasi dan cara penggabungan teks pada perintah println yang keliru.
Namun, jika kesalahan tersebut diperbaiki sesuai dengan logika yang dimaksud, kedua program akan menghasilkan output yang
sama persis, yaitu "Paper size in centimeters: 21.59 by 27.94".
 */

/*
2.Apa perbedaan penggunaan final double dengan public static final double?
Perbedaan utama antara final double dan public static final double terletak pada lingkup (scope) dan aksesibilitasnya.
Penggunaan final double di dalam metode main menjadikannya sebuah konstanta lokal, yang artinya hanya dikenali dan bisa
digunakan di dalam metode main itu sendiri. Sebaliknya, public static final double adalah sebuah konstanta kelas yang bersifat
global (public), dapat diakses dari kelas mana pun, dan hanya ada satu salinannya di memori karena bersifat static. Ini menjadikan
public static final double cara yang standar dan lebih baik untuk mendefinisikan konstanta yang perlu digunakan di banyak tempat.
 */
