/* Nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Sabtu, 1 Maret 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    /* ATRIBUT */
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    /* KONSTRUKTOR */
    public Mahasiswa() {
        nim = "";
        nama = "";
        prodi = "";
        listMatKul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    /* SELEKTOR */
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public ArrayList<MataKuliah> getLisMatKul() {
        return listMatKul;
    }

    public Dosen getDosen() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    /* MUTATOR */
    public void setNim(String a) {
        this.nim = a;
    }

    public void setNama(String b) {
        this.nama = b;
    }

    public void setProdi(String c) {
        this.prodi = c;
    }

    public void setDosenWali (Dosen d) {
        this.dosenWali = d;
    }

    public void setKendaraan (Kendaraan e) {
        this.kendaraan = e;
    }

    /* METHOD */
    public void addMatkul (MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    public int getJumlahSKS() {
        int jum = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            jum += listMatKul.get(i).getSks();
        }
        return jum;
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata Kuliah yang diambil: ");
        int i;
        for (i = 0; i < listMatKul.size(); i++) {
            System.out.println(listMatKul.get(i).getIdMatKul() + " - " + listMatKul.get(i).getNamaMatKul() + " | SKS = " + listMatKul.get(i).getSks());
        }
        System.out.println("Dosen Wali:");
        System.out.println("Nama = " + dosenWali.getNama() + " | NIP = " + dosenWali.getNip() + " | Prodi = " + dosenWali.getProdi());

        System.out.println("Kendaraan:");
        System.out.println("Plat = " + kendaraan.getNoPlat() + " | Jenis = " + kendaraan.getJenis());
    }
}