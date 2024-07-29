package TP07;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int hasil = s.nextInt();

        for (int i = 1; i <= hasil; i++ ){

            if (i % 2 == 0){
                System.out.println(i + " " + "genap");
            } else {
                System.out.println(i + " " + "ganjil");
            }

        }
    }   
}
