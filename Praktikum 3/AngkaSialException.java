/* Nama File : AngkaSialException.java
 * Deskripsi : Program untuk mendefinisikan exception kustom saat memasukkan angka tertentu
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Sabtu, 8 Maret 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("hati-hati memasukkan angka!!!");
    }
}
