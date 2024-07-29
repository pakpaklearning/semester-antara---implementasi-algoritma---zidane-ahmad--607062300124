package TP07;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int input = s.nextInt();
        
        int hasil = 1;

          for (int i = 1; i <= input; i++){
            hasil *= i;
    

        }
        
        System.err.println(hasil);
    }
}
