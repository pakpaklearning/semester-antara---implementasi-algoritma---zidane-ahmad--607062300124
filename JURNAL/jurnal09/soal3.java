package jurnal09;

import java.util.Scanner;

public class soal3 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int angka = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(angka);
                angka = (angka + 1) % 10; // modulus 10 untuk kembali ke 0 setelah 9
            }
            System.out.println(); 
        }  
    }
}

