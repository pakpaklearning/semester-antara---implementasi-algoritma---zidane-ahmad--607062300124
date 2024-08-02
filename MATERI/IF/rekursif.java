package MATERI.IF;

import java.util.Scanner;

public class rekursif {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int bilangan = s.nextInt();
        int hasil = hitungFaktorial(bilangan);
        System.out.println(hasil);
    }
        public static int hitungFaktorial(int n){

            if (n == 1) {
                return 1;
                
            } else {
                return  n * hitungFaktorial(n - 1);
            }
        }
        
    }

