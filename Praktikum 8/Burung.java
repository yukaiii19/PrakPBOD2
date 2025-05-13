/* Nama File : Burung.java
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 13 Mei 2025
 */

public class Burung extends Anabul{
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "cuit";
    }

    @Override
    public String gerak() {
        return "terbang";
    }
}
