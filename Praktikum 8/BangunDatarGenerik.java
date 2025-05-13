/* Nama File : BangunDatarGenerik.java
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Selasa, 13 Mei 2025
 */

import java.util.ArrayList;
import java.util.List;

public class BangunDatarGenerik <T extends BangunDatar> {
    private List<T> list = new ArrayList<>();

    public void add (T bd) {
        list.add(bd);
    }

    public void showAll() {
        for (T bd : list) {
            System.out.println("Bangun Datar : " + bd.getNama());
            System.out.println("Luas : " + bd.luas());
            System.out.println("Keliling : " + bd.keliling());
            System.out.println();
        }
    }
}
