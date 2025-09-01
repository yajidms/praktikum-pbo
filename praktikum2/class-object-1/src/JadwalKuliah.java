import java.util.ArrayList;
import java.util.List;

public class JadwalKuliah {
  private String namaKelas;
  private List<MataKuliah> daftarMataKuliah;

  public JadwalKuliah(String namaKelas) {
    this.namaKelas = namaKelas;
    this.daftarMataKuliah = new ArrayList<>();
  }

  public void tambahMataKuliah(MataKuliah mk) {
    this.daftarMataKuliah.add(mk);
  }

  public void tampilkan() {
    String judul = "JADWAL KULIAH KELAS " + this.namaKelas;
    String garis = "=".repeat(154);

    System.out.println(garis);
    System.out.printf("|%78s%75s|\n", judul, "");
    System.out.println(garis);
    System.out.printf("| %-10s | %-15s | %-45s | %-50s | %-18s |\n", "Hari", "Waktu", "Nama Mata Kuliah", "Nama Dosen", "Ruangan");
    System.out.println(garis);

    for (MataKuliah mk : daftarMataKuliah) {
      mk.tampilkanInfo();
    }
  }
  public void cariJadwal (String kataKunci){
    List<MataKuliah> hasilPencarian = new ArrayList<>();
    String kataKunciLower = kataKunci.toLowerCase();

    // looping ke setiap mata kuliah
    for (MataKuliah mk : this.daftarMataKuliah) {
      if (mk.getHari().toLowerCase().contains(kataKunciLower) ||
              mk.getNamaMk().toLowerCase().contains(kataKunciLower) ||
              mk.getWaktu().toLowerCase().contains(kataKunciLower)) {
        hasilPencarian.add(mk);
      }
    }

    System.out.println("\n===== HASIL PENCARIAN UNTUK '" + kataKunci + "' =====");
    if (hasilPencarian.isEmpty()) {
      System.out.println("Data tidak ditemukan.");
    } else {
      String garis = "=".repeat(154);
      System.out.println(garis);
      System.out.printf("| %-10s | %-15s | %-45s | %-50s | %-18s |\n", "Hari", "Waktu", "Nama Mata Kuliah", "Nama Dosen", "Ruangan");
      System.out.println(garis);
      for (MataKuliah mk : hasilPencarian) {
        mk.tampilkanInfo();
      }
      System.out.println(garis);
    }
  }
}