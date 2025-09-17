package id.ac.polban.service;

import id.ac.polban.model.*;

/**
 * Factory penyedia data jadwal.
 * Menggunakan pewarisan: MataKuliah (teori) & KegiatanPraktikum (praktikum).
 */
public class DataJadwal {
  public static final String DEFAULT_KELAS = "2C-D3";

  public static JadwalKuliah getJadwalKelas2C() {
    JadwalKuliah jadwal = new JadwalKuliah(DEFAULT_KELAS);

    // Teori
    jadwal.tambahKegiatan(new MataKuliah("Senin", "07:00 - 08:40", "Aljabar Linear", "Muhammad Rizqi S", "D112-Kelas"));
    jadwal.tambahKegiatan(new MataKuliah("Senin", "09:50 - 12:20", "Matematika Diskrit 2", "Setiadi Rachmat", "D112-Kelas"));
    jadwal.tambahKegiatan(new MataKuliah("Senin", "13:00 - 14:40", "Komputer Grafik", "Yudi Widhiyasana", "D112-Kelas"));
    // Praktikum (menggunakan subclass)
    jadwal.tambahKegiatan(new KegiatanPraktikum("Senin", "14:40 - 16:40", "Komputer Grafik (PR)", "Trisna Gelar A", "D102-Lab. MT"));

    jadwal.tambahKegiatan(new MataKuliah("Selasa", "07:00 - 08:40", "Basis Data", "Ade Chandra Nugraha", "D112-Kelas"));
    jadwal.tambahKegiatan(new MataKuliah("Selasa", "10:40 - 12:20", "Pengantar Rekayasa Perangkat Lunak", "Santi Sundari", "D112-Kelas"));

    jadwal.tambahKegiatan(new MataKuliah("Rabu", "07:50 - 09:30", "Pemrograman Berorientasi Objek", "Zulkifli Arsyad", "D112-Kelas"));
    jadwal.tambahKegiatan(new MataKuliah("Rabu", "13:00 - 18:20", "Proyek 3: Pengemb. Perangkat Lunak Berbasis Web", "Wendi W; Didik S P; Lukmannul H F", "D116-Lab. PjBL-2"));

    // Praktikum Kamis
    jadwal.tambahKegiatan(new KegiatanPraktikum("Kamis", "10:40 - 14:40", "Pengantar Rekayasa Perangkat Lunak (PR)", "Rahil Jumiyani", "D116-Lab. PjBL-2"));
    jadwal.tambahKegiatan(new KegiatanPraktikum("Kamis", "14:40 - 16:40", "Pemrograman Berorientasi Objek (PR)", "Ardhian Ekawijana", "D107-Lab. RPL"));

    // Praktikum Jumat
    jadwal.tambahKegiatan(new KegiatanPraktikum("Jumat", "09:50 - 14:40", "Basis Data (PR)", "Sri Ratna W", "D106-Lab. SDB"));

    return jadwal;
  }
}

