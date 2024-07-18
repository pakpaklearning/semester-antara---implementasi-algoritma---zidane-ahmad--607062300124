package jurnal05;

import java.util.Scanner;

public class soal3 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jari-jari (r): ");
        double r = s.nextDouble();

        System.out.print("Masukkan tinggi (h): ");
        double h = s.nextDouble();

        double luasPermukaanKerucut = luasPermukaanKerucut(r, h);
        double luasPermukaanTabung = luasPermukaanTabung(r, h);

        System.out.printf("Luas Permukaan Kerucut: %.2f\n", luasPermukaanKerucut);
        System.out.printf("Luas Permukaan Tabung: %.2f\n", luasPermukaanTabung);

        s.close();
    }

    public static double luasPermukaanKerucut(double r, double h) {
        double s = Math.sqrt(r * r + h * h); // Panjang garis 
        return Math.PI * r * (r + s);
    }

    public static double luasPermukaanTabung(double r, double h) {
        return 2 * Math.PI * r * (r + h);
    }
}

