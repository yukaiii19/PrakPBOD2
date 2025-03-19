/* Nama File : DosenTamu.java
 * Deskripsi : kelas untuk dosen tamu yang merupakan extend atau turunan dari Dosen
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Rabu, 19 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen{
    protected String NIDK;
    private final LocalDate tanggalAkhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate tanggalAkhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    @Override
    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    public String MasaKontrak() {
        Period lama = Period.between(LocalDate.of(2025,3,10), tanggalAkhirKontrak);
        int tahun = lama.getYears();
        int bulan = lama.getMonths();
        return ((tahun * 12) + bulan) + " bulan";
    }

    @Override
    public void printInfo() {
        System.out.println("NIDK        : " + NIDK);
        super.printInfo();
        System.out.println("Jabatan     : Dosen Tamu");
        System.out.println("Tanggal berakhir kontrak : " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Masa kontrak berakhir : " + MasaKontrak());
    }
}
