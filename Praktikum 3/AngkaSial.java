/* Nama File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri, pengenalan klausa 'throw' dan 'throws'
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Sabtu, 8 Maret 2025
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("jangan memasukkan angka 13 karena angka sial!!!");
        }
    }
}

// Baris 12 tidak dieksekusi saat angka == 13 karena eksepsi terjadi sebelum mencapainya.
// Baris 21 pasti dieksekusi karena cobaAngka(13) mengaktifkan eksepsi dan program langsung masuk ke blok catch.