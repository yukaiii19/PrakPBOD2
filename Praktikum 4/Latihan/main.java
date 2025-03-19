/* Nama File : main.java
 * Deskripsi : main class untuk implementasi dari kelas Pegawai dan turunannya (DosenTamu, DosenTetap, Tendik)
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Rabu, 19 Maret 2025
 */

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        System.out.println("===== DOSEN TETAP =====");
        DosenTetap D1 = new DosenTetap(
            "12345", 
            "Dr. Budi", 
            LocalDate.of(1980, 1, 15), 
            LocalDate.of(2010, 6, 1), 
            7000000, 
            "Fakultas Sains dan Matematika", 
            "12313");
        D1.printInfo();

        System.out.println("\n===== DOSEN TAMU =====");
        DosenTamu D2 = new DosenTamu(
            "32341",
            "Prof. Anto", 
            LocalDate.of(1991,5,20), 
            LocalDate.of(2018,7,21), 
            5000000, 
            "Fakultas Hukum", 
            "42132", 
            LocalDate.of(2028,1,1));
        D2.printInfo();

        System.out.println("\n===== TENDIK =====");
        Tendik T1 = new Tendik(
            "59283", 
            "Budianto", 
            LocalDate.of(1978,3,12), 
            LocalDate.of(2011,4,1), 
            4500000, 
            "Kemahasiswaan");
        T1.printInfo();
    }
}