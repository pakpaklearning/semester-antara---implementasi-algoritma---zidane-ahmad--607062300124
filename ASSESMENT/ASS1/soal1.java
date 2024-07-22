package ASSESMENT.ASS1;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        
        System.out.print("Jabatan Karyawan: ");
        String posisi = s.nextLine();
        System.out.print("Jam kerja sebulan: ");
        int jamKerja = s.nextInt();
        
        double gajiPerJam = 50000;
        double tunjangan = 0;
        double totalGaji = 0;
        
        switch (posisi) {
            case "MGR":
                tunjangan = 1000000;
                break;
            case "STF":
                tunjangan = 500000;
                break;
            case "TCH":
                tunjangan = 750000;
                break;
            case "DRV":
                tunjangan = 350000;
                break;
            default:
                System.out.println("Jabatan tidak valid.");
                return;
        }
        
        totalGaji = jamKerja * gajiPerJam + tunjangan;
        
        if (jamKerja > 170) {
            totalGaji += totalGaji * 0.07; // dapat bonus 7%
        } else if (jamKerja > 160) {
            totalGaji += totalGaji * 0.05; // dapat bonus 5%
        }
        
        System.out.printf("Total honor satu bulan: %.1f\n", totalGaji);
    }
}

