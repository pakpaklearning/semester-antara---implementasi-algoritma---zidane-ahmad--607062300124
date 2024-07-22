package ASSESMENT.ASS1;

import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt(); //jam
        int m = s.nextInt(); //menit
        int v = s.nextInt(); //menit yang di tambahkan

        m += v ; //menit dalam jam akan di tambahkan dengan menit baru

        int hitungJam = h + (m / 60);
        int hitungMenit = m % 60;

        hitungJam = hitungJam % 24; //karna 24 jam

        System.out.printf("%02d:%02d%n", hitungJam, hitungMenit);

    }
}
