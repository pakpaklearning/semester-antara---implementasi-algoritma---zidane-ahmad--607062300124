package TP08;

import java.util.Scanner;

public class soal2 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int angka = s.nextInt();
    int angkaReversed = 0 ;

    do {
        int digitAngka = angka % 10;
        angkaReversed = angkaReversed * 10 + angka;
        angka /= 10;
    } while (angka != 0);
    
    System.out.println(angkaReversed);
}
}
