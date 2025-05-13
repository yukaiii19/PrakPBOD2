/* Nama File : KoleksiAnabul.java
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 13 Mei 2025
 */

import java.util.Random;

public class KoleksiAnabul {
    private Koleksi<Anabul> koleksi;

    public KoleksiAnabul() {
        koleksi = new Koleksi<>(10);
        isiKoleksi();
    }

    private void isiKoleksi() {
        Random rand = new Random();
        String[] namaHewan = {"Kitty", "Bruno", "Tweety", "Milo", "Oscar", "Luna", "Coco", "Rocky", "Snowy", "Chico"};

        for (int i = 0; i < 10; i++) {
            int jenis = rand.nextInt(3);
            String nama = namaHewan[i];

            switch (jenis) {
                case 0 -> koleksi.add(new Kucing(nama));
                case 1 -> koleksi.add(new Anjing(nama));
                case 2 -> koleksi.add(new Burung(nama));
            }
        }
    }

    public void showAll() {
        System.out.println("Isi KoleksiAnabul:");
        for (int i = 0; i < koleksi.getSize(); i++) {
            Anabul a = koleksi.getIsi(i);
            System.out.println("Nama : " + a.getNama());
            System.out.println("bersuara " + a.suara());
            System.out.println("bergerak dengan " + a.gerak());
            System.out.println();
        }
    }
}
