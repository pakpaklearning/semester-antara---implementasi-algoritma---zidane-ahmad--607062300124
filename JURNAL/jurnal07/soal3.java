package jurnal07;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int angka = s.nextInt();
        boolean bilanganPrima = true;

        if (angka < 2) {
            bilanganPrima = true;
        } else {
            for (int i = 2; i <= angka / 2 ; i++) {
                if (angka % i == 0) {
                    bilanganPrima = false;
                    break;
                }
            }
        }

        if (bilanganPrima) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }
}
