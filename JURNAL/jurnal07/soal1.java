package jurnal07;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    String kata = s.nextLine();
    int panjangKata = kata.length();

    for (int i = panjangKata - 1; i >= 0; i-- ){
        System.out.print(kata.charAt(i));
 
        
    }
   }
}
