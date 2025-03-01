/* Nama File : MMahasiswa.java
 * Deskripsi : Berisi aplikasi dari class Dosen, Kendaraan, MataKuliah, dan Mahasiswa
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Sabtu, 1 Maret 2025
 */

public class MMahasiswa {
    public static void main(String[] args) {
        // Mata Kuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah GKV = new MataKuliah("GKV", "Grafika dan Komputasi Visual", 3);

        // Mahasiswa
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Mahasiswa M2 = new Mahasiswa("154", "Jeki", "Informatika");
        Mahasiswa M3 = new Mahasiswa("210", "Reza", "Informatika");

        // Dosen
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Dosen D2 = new Dosen("056", "Bowo", "Informatika");
        
        // Kendaraan
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");
        Kendaraan K2 = new Kendaraan("K1905HL", "Mobil");

        // Menetapkan dosen wali dan kendaraan
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M2.setDosenWali(D2);
        M2.setKendaraan(K2);

        // Menambahkan mata kuliah untuk mahasiswa
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M2.addMatkul(GKV);
        M2.addMatkul(PBO);
        M2.addMatkul(MBD);
        
        // Menampilkan detail mahasiswa
        System.out.println("\n=== Mahasiswa 1 ===");
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah yang diambil = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS = " + M1.getJumlahSKS());

        System.out.println("\n=== Mahasiswa 2 ===");
        M2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah yang diambil = " + M2.getJumlahMatKul());
        System.out.println("Jumlah SKS = " + M2.getJumlahSKS());

        System.out.println("\n=== Mahasiswa 3 ===");
        M3.printMhs();
    }
}
