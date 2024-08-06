//minta input bilangan bulat N
//minta input N angka
//mengurutkan
//menampilkan ke layar

package TP13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class soal2 {            
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan jumlah N: ");
        int N = s.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            System.out.println("Masukan angka ke-" + (i + 1) + ":");
            al.add(s.nextInt());

        }

        for (int x : al) {
            System.out.print(x + " ");
        }

    }
}
