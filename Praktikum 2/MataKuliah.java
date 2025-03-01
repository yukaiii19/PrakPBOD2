/* Nama File : MataKuliah.java
 * Deskripsi : Berisi atribut dan method dalam class MataKuliah
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Sabtu, 1 Maret 2025
 */

public class MataKuliah {
    /* ATRIBUT */
    private String idMatKul;
    private String nama;
    private double sks;

    /* KONSTRUKTOR */
    public MataKuliah() {
        idMatKul = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah(String idMatKul, String nama, double sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    /* SELEKTOR */
    public String getIdMatKul() {
        return idMatKul;
    }

    public String getNamaMatKul() {
        return nama;
    }

    public double getSks() {
        return sks;
    }

    /* MUTATOR */
    public void setIdMatKul(String x) {
        this.idMatKul = x;
    }

    public void setNama(String y) {
        this.nama = y;
    }

    public void setSks(double z) {
        this.sks = z;
    }

}
