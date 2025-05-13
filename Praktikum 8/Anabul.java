/* Nama File : Anabul.java
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 13 Mei 2025
 */

public abstract class Anabul {
    protected String nama;

    public Anabul (String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String suara();
    public abstract String gerak();
}
