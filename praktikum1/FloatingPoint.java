public class FloatingPoint {
  public static void main(String[] args) {
    double x = 92.98;
    int nx = (int) Math.round(x);
    System.out.println("nilai = " + nx);
  }
}

/*
1.Pada kasus berikut jelaskan nilai nx setelah digunakan Math.round(x);
Nilai nx akan menjadi 93. Ini karena Math.round(92.98) membulatkan angka
tersebut ke long terdekat, yaitu 93, yang kemudian di-cast (diubah paksa) menjadi tipe int.
 */

/*
2. Kenapa dibutuhkan cast (int) dalam penggunaan Math.round(x) ?
Cast (int) diperlukan karena Math.round() untuk double selalu menghasilkan tipe long, sementara
nx adalah int. Java tidak mengizinkan konversi otomatis dari tipe data yang lebih besar (long) ke
yang lebih kecil (int) tanpa perintah eksplisit, sehingga (int) wajib digunakan untuk memaksa konversi
tersebut dan menghindari error.
 */