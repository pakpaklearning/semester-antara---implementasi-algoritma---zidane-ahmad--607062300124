package TP13;
import java.util.Arrays;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
        int N = s.nextInt();
        s.nextLine();
        String [] namaPerserta = new String[N];

            //minta input pengguna menggunakan perulangan
            for (int i = 0; i < N; i ++){
                namaPerserta [i] = s.nextLine();
            }

            for (int i = 0; i < N; i++){
                System.out.println("Bulan" + (i + 1) + ":" + namaPerserta [i]);
            }

    }       
}
