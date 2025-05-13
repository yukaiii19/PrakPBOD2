/* Nama File : Kucing.java
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 13 Mei 2025
 */

public class Kucing extends Anabul{
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "meong";
    }

    @Override
    public String gerak() {
        return "melata";
    }
}
