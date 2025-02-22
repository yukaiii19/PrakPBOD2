/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Muhammad Syauqi Satrio Wibowo / 24060123120021
 * Tanggal : Sabtu, 22 Februari 2025
 */

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    void printCounterTitik() {
        System.out.println(this.counterTitik);
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    Titik (double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran() {
        int kuadran;
        if (absis >= 0 && ordinat >= 0) {
            kuadran = 1;
        } else if (absis < 0 && ordinat >= 0) {
            kuadran = 2;
        } else if (absis < 0 && ordinat < 0) {
            kuadran = 3;
        } else {
            kuadran = 4;
        }
        return kuadran;
    }

    double getJarakPusat() {
        return Math.sqrt(Math.pow((Math.abs(absis)),2) + Math.pow((Math.abs(ordinat)),2));
    }

    double getJarak(Titik T) {
        return Math.sqrt(Math.pow(Math.abs(this.absis - T.absis),2) + Math.pow(Math.abs(this.ordinat - T.ordinat),2));
    }

    void refleksiX() {
        ordinat = ordinat * -1;
    }

    void refleksiY() {
        absis = absis * -1;
    }

    Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }


}