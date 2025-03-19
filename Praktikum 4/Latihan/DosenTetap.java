/* Nama File : DosenTetap.java
 * Deskripsi : kelas untuk dosen tetap yang merupakan extend atau turunan dari Dosen
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Rabu, 19 Maret 2025
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen{
    private static final int BUP = 65;
    protected String NIDN;

    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String x) {
        this.NIDN = x;
    }
    
    public LocalDate hitungBUP() {
        LocalDate bupDate = tanggalLahir.plusYears(BUP);
        bupDate = bupDate.plusMonths(1);
        return LocalDate.of(bupDate.getYear(), bupDate.getMonth(), 1);
    }
    
    
    @Override
    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerjaTahun() * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIDN        : " + NIDN);
        super.printInfo();
        System.out.println("Jabatan     : Dosen Tetap");
        System.out.println("BUP         : " + formatTanggal(hitungBUP()));
    }
}
