/* Nama File : Main.java
 * Deskripsi : Program main untuk Anabul dan subclassnya
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 29 April 2025
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Anabul anabul1 = new Kucing("Cireng");
        Anabul anabul2 = new Anjing("BulBul");
        Anabul anabul3 = new Burung("Beo");

        ArrayList<Anabul> nab = new ArrayList<>();
        nab.add(anabul1);
        nab.add(anabul2);
        nab.add(anabul3);

        for (Anabul anabul : nab) {
            anabul.Gerak();
            anabul.Bersuara();
            System.out.println();
        }
    }

}
