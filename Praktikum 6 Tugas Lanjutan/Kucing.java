/* Nama File : Kucing.java
 * Deskripsi : Program untuk subclass Kucing
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 29 April 2025
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara meong");
    }
}
