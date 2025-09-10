package id.ac.polban.model;

public class MataKuliah {
  private String hari;
  private String waktu;
  private String namaMk;
  private String namaDosen;
  private String ruangan;

  public MataKuliah(String hari, String waktu, String namaMk, String namaDosen, String ruangan) {
    this.hari = hari;
    this.waktu = waktu;
    this.namaMk = namaMk;
    this.namaDosen = namaDosen;
    this.ruangan = ruangan;
  }

  public void tampilkanInfo() {
    System.out.printf("| %-10s | %-15s | %-45s | %-50s | %-18s |\n",
            this.hari, this.waktu, this.namaMk, this.namaDosen, this.ruangan);
  }

  public String getHari() { return hari; }
  public String getWaktu() { return waktu; }
  public String getNamaMk() { return namaMk; }
  public String getNamaDosen() { return namaDosen; }
  public String getRuangan() { return ruangan; }

  @Override
  public String toString() {
    return String.format("%s %s %s (%s) %s", hari, waktu, namaMk, namaDosen, ruangan);
  }
}