/* Nama File : TestPolimorfisme.java
 * Deskripsi : Program main untuk tes polmorfisme
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Sabtu, 26 April 2025
 */

import java.util.ArrayList;

public class TestPolimorfisme {
    
    public static void main(String[] args) {
        
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

// 2. Dalam kasus ini, polimorfisme berfungsi untuk memungkinkan kita menggunakan objek superclass Pegawai untuk mewakili objek lainnya yang merupakan subclass (Programmer dan Manajer).
// 3. Jika tidak menggunakan polimorfisme, kita harus membuat list atau variabel yang berbeda untuk setiap jenis pegawai, sehingga akan lebih kompleks.
