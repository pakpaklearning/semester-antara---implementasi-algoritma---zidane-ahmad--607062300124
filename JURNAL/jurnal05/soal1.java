package jurnal05;

import java.util.Scanner;

public class soal1 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan nama pertama: ");
        String nama1 = s.nextLine();
        
        System.out.print("Masukkan nama kedua: ");
        String nama2 = s.nextLine();
        
        System.out.print("Masukkan jam (0-23): ");
        int jam = s.nextInt();

        String salam = salam(jam);

        System.out.println("Nama 1: " + nama1);
        System.out.println("Nama 2: " + nama2);
        System.out.println("Halo, " + nama1 + "." + " " + salam);
        System.out.println("Halo, " + nama2 + "." + " " +salam);

    }
    
    public static String salam(int jam) {
        if (jam >= 6 && jam <= 11) {
            return "Selamat Pagi";
        } else if (jam >= 12 && jam <= 14) {
            return "Selamat Siang";
        } else if (jam >= 15 && jam <= 17) {
            return "Selamat Sore";
        } else if ((jam >= 18 && jam <= 23) || (jam >= 0 && jam <= 5)) {
            return "Selamat Malam";
        } else {
            return "Waktu tidak valid";
        }
    }
}

