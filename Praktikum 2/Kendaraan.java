/* Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Sabtu, 1 Maret 2025
 */

public class Kendaraan {
    /* ATRIBUT */
    private String noPlat;
    private String jenis;

    /* KONSTRUKTOR */
    public Kendaraan() {
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /* SELEKTOR */
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    /* MUTATOR */
    public void setNoPlat(String x) {
        this.noPlat = x;
    }

    public void setJenis(String y) {
        this.jenis = y;
    }
}
