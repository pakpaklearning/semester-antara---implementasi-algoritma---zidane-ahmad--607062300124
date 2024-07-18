package latihanSwitch;

import java.util.Scanner;

public class soal3 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan Kota tujuan: ");
        String kotaTujuan = s.nextLine();

        System.out.print("Jumlah Penumpang: ");
        int jumlahPenumpang = s.nextInt();

        int hargaTiket = getHargaTiket(kotaTujuan);
        int totalPembayaran = hitungTotalPembayaran(hargaTiket, jumlahPenumpang);

        System.out.println("Total Pembayaran: " + totalPembayaran);
    }

    // Metode untuk mendapatkan harga tiket berdasarkan kota tujuan
    public static int getHargaTiket(String kotaTujuan) {
        int hargaTiket = 0;
        switch (kotaTujuan) {
            case "Jakarta":
                hargaTiket = 145000;
                break;
            case "Bogor":
                hargaTiket = 200000;
                break;
            case "Garut":
                hargaTiket = 75000;
                break;
            case "Purwakarta":
                hargaTiket = 75000;
                break;
            default:
                System.out.println("Kota tujuan tidak tersedia.");
                break;
        }
        return hargaTiket;
    }

    // Metode untuk menghitung total pembayaran
    public static int hitungTotalPembayaran(int hargaTiket, int jumlahPenumpang) {
        return hargaTiket * jumlahPenumpang;
    }
}

