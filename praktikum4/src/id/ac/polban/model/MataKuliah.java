package id.ac.polban.model;

public class MataKuliah extends Kegiatan {
  private String namaMk;
  private String namaDosen;

  public MataKuliah(String hari, String waktu, String namaMk, String namaDosen, String ruangan) {
    super(hari, waktu, ruangan); // inisialisasi atribut umum melalui superclass
    this.namaMk = namaMk;
    this.namaDosen = namaDosen;
  }

  @Override
  public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.printf("%-45s | %-50s | %-18s |\n", this.namaMk, this.namaDosen, getRuangan());
  }

  @Override
  public String getNamaKegiatan() { return this.namaMk; }
  public String getNamaMk() { return namaMk; }
  public String getNamaDosen() { return namaDosen; }

  @Override
  public String toString() {
    return String.format("%s - %s (%s) %s", getHari(), getWaktu(), this.namaDosen, getRuangan());
  }
}

