package TP09;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n  = s.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (j == i){
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   

        for (int i = n - 1; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                if (j == i){
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
