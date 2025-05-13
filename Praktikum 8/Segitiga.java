/* Nama File : Segitiga.java
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 13 Mei 2025
 */

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = Math.hypot(alas / 2,  tinggi);
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double keliling() {
        return 2 * sisi + alas;
    }
}
