import id.ac.polban.model.*;
import id.ac.polban.service.*;

public class TestRun {
  public static void main(String[] args) {
    JadwalKuliah jadwal = DataJadwal.getJadwalKelas2C();
    // Tampilkan semua jadwal
    jadwal.tampilkan();
    // Uji pencarian kata kunci 'PR' (praktikum)
    jadwal.cariJadwal("PR");
    // Uji pencarian hari
    jadwal.cariJadwal("Senin");
    // Uji pencarian tidak ada
    jadwal.cariJadwal("TidakAda");
  }
}

