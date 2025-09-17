package id.ac.polban.model;

public class KegiatanPraktikum extends Kegiatan {
  private String namaPraktikum;
  private String namaAsisten;

  public KegiatanPraktikum(String hari, String waktu, String namaPraktikum, String namaAsisten, String ruangan) {
    super(hari, waktu, ruangan);
    this.namaPraktikum = namaPraktikum;
    this.namaAsisten = namaAsisten;
  }

  @Override
  public void tampilkanInfo() {
    super.tampilkanInfo();
    // Kolom: Nama Mata Kuliah | Nama Dosen (diganti Asisten) | Ruangan
    System.out.printf("%-45s | %-50s | %-18s |%n", this.namaPraktikum, "Asisten: " + this.namaAsisten, getRuangan());
  }

  @Override
  public String getNamaKegiatan() { return this.namaPraktikum; }
  public String getNamaPraktikum() { return namaPraktikum; }
  public String getNamaAsisten() { return namaAsisten; }

  @Override
  public String toString() {
    return String.format("%s - %s [Asisten: %s] (%s)", getHari(), getNamaPraktikum(), getNamaAsisten(), getRuangan());
  }
}

