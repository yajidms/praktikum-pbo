import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // mengambil data jadwal
    JadwalKuliah jadwal2c = DataJadwal.getJadwalKelas2C();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("1. Cari Jadwal (berdasarkan Hari/Matkul/Waktu)");
      System.out.println("2. Tampilkan Semua Jadwal");
      System.out.println("3. Keluar");
      System.out.print("Pilihan : ");

      String pilihan = scanner.nextLine();

      switch (pilihan) {
        case "1":
          System.out.print("Masukkan kata kunci pencarian : ");
          String kataKunci = scanner.nextLine();
          jadwal2c.cariJadwal(kataKunci);
          break;

        case "2":
          jadwal2c.tampilkan();
          break;

        case "3":
          scanner.close();
          return;

        default:
          System.out.println("\n[ERROR]");
          break;
      }
    }
  }
}