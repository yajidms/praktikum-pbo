package id.ac.polban.model;

import java.util.ArrayList;
import java.util.List;

public class JadwalKuliah {
  public static final int TOTAL_LEBAR_TABEL = 154;
  private static final String HEADER_FORMAT = "| %-10s | %-15s | %-45s | %-50s | %-18s |";

  private String namaKelas;
  private List<Kegiatan> daftarKegiatan;

  public JadwalKuliah(String namaKelas) {
    this.namaKelas = namaKelas;
    this.daftarKegiatan = new ArrayList<>();
  }

  public void tambahKegiatan(Kegiatan k) { this.daftarKegiatan.add(k); }
  // Metode kompatibilitas agar kode lama (jika ada) tetap bisa dipakai.
  public void tambahMataKuliah(MataKuliah mk) { this.daftarKegiatan.add(mk); }

  public void tampilkan() {
    String judul = "JADWAL KULIAH KELAS " + this.namaKelas;
    String garis = "=".repeat(TOTAL_LEBAR_TABEL);

    System.out.println(garis);
    System.out.printf("|%78s%75s|\n", judul, "");
    System.out.println(garis);
    System.out.printf(HEADER_FORMAT + "\n", "Hari", "Waktu", "Nama Mata Kuliah", "Nama Dosen", "Ruangan");
    System.out.println(garis);

    for (Kegiatan keg : daftarKegiatan) {
      keg.tampilkanInfo();
    }
  }

  public void cariJadwal(String kataKunci) {
    List<Kegiatan> hasilPencarian = new ArrayList<>();
    String lower = kataKunci.toLowerCase();

    for (Kegiatan k : this.daftarKegiatan) {
      boolean match = k.getHari().toLowerCase().contains(lower) ||
              k.getWaktu().toLowerCase().contains(lower) ||
              k.getNamaKegiatan().toLowerCase().contains(lower);
      if (match) hasilPencarian.add(k);
    }

    System.out.println("\n===== HASIL PENCARIAN UNTUK '" + kataKunci + "' =====");
    if (hasilPencarian.isEmpty()) {
      System.out.println("Data tidak ditemukan.");
    } else {
      String garis = "=".repeat(TOTAL_LEBAR_TABEL);
      System.out.println(garis);
      System.out.printf(HEADER_FORMAT + "\n", "Hari", "Waktu", "Nama Mata Kuliah", "Nama Dosen", "Ruangan");
      System.out.println(garis);
      for (Kegiatan k : hasilPencarian) {
        k.tampilkanInfo();
      }
      System.out.println(garis);
    }
  }
}

