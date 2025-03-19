/* Nama File : Pegawai.java
 * Deskripsi : kelas abstrak untuk pegawai
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Rabu, 19 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public abstract class Pegawai {
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    public Pegawai() {
        this.NIP = "";
        this.nama = "";
        this.tanggalLahir = LocalDate.now();
        this.TMT = LocalDate.now();
        this.gajiPokok = 0;
    }

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setNIP(String a) {
        this.NIP = a;
    }

    public void setNama(String b) {
        this.nama = b;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    protected String formatTanggal(LocalDate tanggal) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        return tanggal.getDayOfMonth() + " " + namaBulan[tanggal.getMonthValue() - 1] + " " + tanggal.getYear();
    }

    public String hitungMasaKerja() {
        Period periode = Period.between(TMT, LocalDate.of(2025,3,10));
        int tahun = periode.getYears();
        int bulan = periode.getMonths();
        return tahun + " tahun " + bulan + " bulan";
    }

    public int hitungMasaKerjaTahun() {
        return Period.between(TMT, LocalDate.of(2025,3,10)).getYears();
    }
    
    public int hitungMasaKerjaBulan() {
        return Period.between(TMT, LocalDate.of(2025,3,10)).getMonths();
    }

    public int hitungBUP(int batasUsia) {
        return tanggalLahir.getYear() + batasUsia;
    }

    public double hitungTunjangan() {
        return 0;
    }

    public void printInfo() {
        System.out.println("NIP         : " + NIP);
        System.out.println("Nama        : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));  
        System.out.println("TMT         : " + formatTanggal(TMT));
        System.out.println("Masa Kerja  : " + hitungMasaKerja());
        System.out.println("Gaji Pokok  : Rp " + gajiPokok);
        System.out.println("Tunjangan   : Rp" + String.format("%,.2f", hitungTunjangan()));
    }
}
