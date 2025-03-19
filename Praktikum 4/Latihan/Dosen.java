/* Nama File : Dosen.java
 * Deskripsi : kelas abstrak untuk dosen yang merupakan extend atau turunan dari Pegawai
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Rabu, 19 Maret 2025
 */

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }
    
    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas    : " + fakultas);
    }
}
