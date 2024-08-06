package jurnal11;

import java.util.Scanner;

public class soal2 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);

        int angka1 = s.nextInt();
        int angka2 = s.nextInt();

        // Menghitung FPB 
        while (angka2 != 0) {
            int temp = angka2;
            angka2 = angka1 % angka2;
            angka1 = temp;
        }

        System.out.println(angka1);
    }
}

    

