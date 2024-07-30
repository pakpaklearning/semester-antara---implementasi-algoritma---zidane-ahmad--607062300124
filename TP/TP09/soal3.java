package TP09;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("masukan angka:");
        int angka = s.nextInt();

        for (int i = 2; i <= angka; ++i) {
            if (bilanganPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean bilanganPrima(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); ++i) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
