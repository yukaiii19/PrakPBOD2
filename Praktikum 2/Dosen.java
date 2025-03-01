/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Sabtu, 1 Maret 2025
 */

public class Dosen {
    /* ATRIBUT */
    private String nip;
    private String nama;
    private String prodi;

    /* KONSTRUKTOR */
    public Dosen() {
        nip = "";
        nama = "";
        prodi = "";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* SELEKTOR */
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    /* MUTATOR */
    public void setNip(String x) {
        this.nip = x;
    }

    public void setNama(String y) {
        this.nama = y;
    }

    public void setProdi(String z) {
        this.prodi = z;
    }
}
