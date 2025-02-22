/* Nama File : MTitik.java
 * Deskripsi : Berisi aplikasi file Titik.java
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Sabtu, 22 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        System.out.println("==== TITIK T1 ====");
        T1.setAbsis(5);
        T1.setOrdinat(3);
        T1.printTitik();
        System.out.println("Absis T1 adalah " + T1.getAbsis());
        T1.geser(2,3);
        T1.printTitik();
        System.out.println("Ordinat T1 adalah " + T1.getOrdinat());
        T1.setAbsis(4);
        T1.setOrdinat(2);
        T1.printTitik();
        T1.refleksiX();
        T1.refleksiY();
        T1.printTitik();
        System.out.println("Kuadran " + T1.getKuadran());
        System.out.println("Jarak T1 ke Pusat adalah " + T1.getJarakPusat());
        System.out.println("==== TITIK T2 ====");
        Titik T2 = T1;
        T2.printTitik();
        System.out.println("T2 awal mengikuti nilai T1");
        T1.setAbsis(8);
        T1.setOrdinat(4);
        T2.printTitik();
        T2.getRefleksiX();
        T2.getRefleksiY();
        System.out.println("T2 akan sama seperti T1");
        T1.printTitik();
        System.out.println("Jarak T1 ke Pusat adalah " + T1.getJarakPusat());
        System.out.println("Jarak T2 ke Pusat adalah " + T2.getJarakPusat());

        Titik T3 = new Titik();
        T3.setAbsis(2);
        T3.setOrdinat(3);
        System.out.println("Jarak T1 ke T3 adalah " + T1.getJarak(T3));


        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());
    }
}
