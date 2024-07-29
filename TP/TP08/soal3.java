package TP08;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int hasil = 0;
        int input;

        do {
            input = s.nextInt();
            hasil += input;

        }while (input != 0);
        System.out.println(hasil);
    }
}
