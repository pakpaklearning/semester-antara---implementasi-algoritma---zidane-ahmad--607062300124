package TP08;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int akhirAmoeba = s.nextInt();
        int awalAmoeba = 30;
        int waktu = 0;
        
        while (awalAmoeba < akhirAmoeba) {
            waktu = waktu + 15;
            awalAmoeba *= 2;
        }
        
        System.out.println(waktu);
    }
}
