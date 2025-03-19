/* Nama File : Tendik.java
 * Deskripsi : kelas untuk tenaga pendidik (Tendik) yang merupakan extend atau turunan dari Pegawai
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Rabu, 19 Maret 2025
 */

import java.time.LocalDate;

public class Tendik extends Pegawai {
    private static final int BUP = 55;
    private String bidang;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }
    
    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
    
    public LocalDate hitungBUP() {
        LocalDate bupDate = tanggalLahir.plusYears(BUP);
        bupDate = bupDate.plusMonths(1);
        return LocalDate.of(bupDate.getYear(), bupDate.getMonth(), 1);
    }
    
    @Override
    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerjaTahun() * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan     : Tendik");
        System.out.println("Bidang      : " + bidang);
        System.out.println("BUP         : " + formatTanggal(hitungBUP()));
    }
}
