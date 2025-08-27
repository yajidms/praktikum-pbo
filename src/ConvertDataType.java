public class ConvertDataType {
  static short methodOne(long l)
  {
    int i = (int) l; return (short)i;
  }
  public static void main(String[] args)
  {
    double d = 10.25; float f = (float) d;
    byte b = (byte) methodOne((long) f); System.out.println(b);
  }
}

/*
1. Jelaskan output nilai dari variable b.
Output dari variabel b adalah 10. Nilai ini didapat karena saat float
10.25f di-cast menjadi long, bagian desimalnya (.25) akan dibuang sehingga nilainya menjadi 10.
Angka 10 ini kemudian melewati konversi ke int, short, dan byte tanpa ada perubahan karena nilainya masih
muat dalam rentang tipe data tersebut.
 */

/*
2. Jelaskan apa yang berubah dari variable d menjadi variable b setelah dilakukan cast ?
Perubahan utama dari variabel d menjadi b adalah tipe data dan hilangnya presisi desimal. Tipe datanya
berubah dari double (angka desimal 64-bit) menjadi byte (angka bulat 8-bit). Perubahan paling signifikan
adalah pada nilainya, di mana bagian desimal .25 hilang sepenuhnya saat konversi dari float ke long,
sehingga nilai akhir 10 hanya berupa bilangan bulat.
 */