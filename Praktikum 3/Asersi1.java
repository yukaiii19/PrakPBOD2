/* Nama File : Asersi1.java
 * Deskripsi : Program untuk mengecek bilangan positif atau negatif
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Sabtu, 8 Maret 2025
 */

public class Asersi1{
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}