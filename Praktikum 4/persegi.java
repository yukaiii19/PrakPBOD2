/* Nama File : persegi.java
 * Deskripsi : kelas untuk persegi
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Rabu, 12 Maret 2025
 */

public class persegi extends bangunDatar {
    private double sisi;

    public persegi() {
        setJmlSisi(4);
    }

    public persegi(double sisi, String warna, String border) {
        // super(4, warna, border);
        // this.sisi = sisi;
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + getSisi());
    }

    public static void printCounterBangunDatar() {
        bangunDatar.printCounterBangunDatar();
    }

}