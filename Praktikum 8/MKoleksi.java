/* Nama File : MKoleksi.java
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 13 Mei 2025
 */

public class MKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);

        for (int i = 0; i < 10; i++) {
            char ch = (char) ('A' + i);  // Karakter dari A sampai J
            koleksiKarakter.add(ch);
        }

        System.out.println("Isi koleksi karakter:");
        koleksiKarakter.showAll();

        koleksiKarakter.delete(5);

        System.out.println("\nSetelah menghapus elemen pada indeks ke-5:");
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen dalam koleksi: " + koleksiKarakter.getSize());
    }
}
