/* Nama File : Anjing.java
 * Deskripsi : Program untuk subclass Anjing
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 29 April 2025
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara guk-guk");
    }
}
