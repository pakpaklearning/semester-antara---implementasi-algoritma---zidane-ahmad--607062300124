package ASSESMENT.ASS1;

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Angka adi: ");
        int adi = s.nextInt();
        System.out.print("Angka budi: ");
        int budi = s.nextInt();
        System.out.print("Angka cici: ");
        int cici = s.nextInt();

        if (adi > budi && adi > cici) {
            System.out.println("adi");
        } else if (budi > adi && budi > cici) {
            System.out.println("budi");
        } else if (cici > adi && cici > budi) {
            System.out.println("cici");
        } else {
            System.out.println("Angka tidak valid");
        }
    }
}
