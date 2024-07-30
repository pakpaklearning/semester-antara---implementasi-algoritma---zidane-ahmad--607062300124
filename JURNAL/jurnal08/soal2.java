package jurnal08;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalRisoles = 0;
        int hitungRisol = 0;

        while (true) {
            int jumlah = s.nextInt();
            if (jumlah == 0) {
                break;
            }
            totalRisoles += jumlah;
            hitungRisol++;
        }

        double avg = (double) totalRisoles / hitungRisol;

        System.out.printf("%.2f%n", avg);

    }
}
