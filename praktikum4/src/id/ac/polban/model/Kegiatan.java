package id.ac.polban.model;

/**
 * Superclass yang merepresentasikan kegiatan umum (kuliah/praktikum).
 * Menyimpan atribut dasar: hari, waktu, dan ruangan.
 * Method tampilkanInfo() hanya mencetak bagian awal baris tabel (Hari & Waktu)
 * agar subclass dapat melanjutkan sisa kolom dan menutup baris.
 */
public class Kegiatan {
  private String hari;
  private String waktu;
  private String ruangan;

  public Kegiatan(String hari, String waktu, String ruangan) {
    this.hari = hari;
    this.waktu = waktu;
    this.ruangan = ruangan;
  }

  // Subclass WAJIB memanggil super.tampilkanInfo() lebih dulu sebelum melengkapi kolom lain.
  public void tampilkanInfo() {
    System.out.printf("| %-10s | %-15s | ", this.hari, this.waktu);
  }

  // Dapat dioverride untuk penggabungan logika pencarian nama kegiatan.
  public String getNamaKegiatan() { return ""; }

  public String getHari() { return hari; }
  public String getWaktu() { return waktu; }
  public String getRuangan() { return ruangan; }

  @Override
  public String toString() {
    return String.format("%s %s (%s)", hari, waktu, ruangan);
  }
}

