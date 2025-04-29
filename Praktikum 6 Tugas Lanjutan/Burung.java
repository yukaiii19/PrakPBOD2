/* Nama File : Burung.java
 * Deskripsi : Program untuk subclass Burung
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 29 April 2025
 */

public class Burung extends Anabul{
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara cuit");
    }
}
