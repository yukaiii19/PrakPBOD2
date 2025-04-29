/* Nama File : Anabul.java
 * Deskripsi : Program untuk superclass Anabul
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 29 April 2025
 */

public class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void Gerak(){
        System.out.println("Hewan bergerak");
    }
    public void Bersuara(){
        System.out.println("Hewan bersuara");
    }
}
