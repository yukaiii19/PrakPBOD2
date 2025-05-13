/* Nama File : MBangunDatarGenerik.java
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 13 Mei 2025
 */

public class MBangunDatarGenerik {
    public static void main(String[] args) {
        BangunDatarGenerik<BangunDatar> bdg = new BangunDatarGenerik<>();
        bdg.add(new Persegi(5));
        bdg.add(new PersegiPanjang(3,5));
        bdg.add(new Segitiga(6,4));
        bdg.showAll();
    }
}
