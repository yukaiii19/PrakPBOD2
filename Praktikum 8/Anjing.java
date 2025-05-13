/* Nama File : Anjing.java
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 13 Mei 2025
 */

public class Anjing extends Anabul{
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "guk-guk";
    }

    @Override
    public String gerak() {
        return "melata";
    }
}
