/* Nama File : lingkaran.java
 * Deskripsi : kelas untuk lingkaran
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Rabu, 12 Maret 2025
 */

public class lingkaran extends bangunDatar {

    private double jari;
    public lingkaran() {
        setJmlSisi(0);
    }

    public lingkaran(double diameter, String warna, String border){
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }
}