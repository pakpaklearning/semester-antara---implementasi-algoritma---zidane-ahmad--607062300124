package jurnal04;

import java.util.Scanner;

public class soal3 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int angka1 = s.nextInt();
        char operasi;
        operasi = s.next().charAt(0);
        int angka2 = s.nextInt();

        switch (operasi) {
            case '+': 
                System.out.println(angka1 + angka2);
                break;
            case '-':
                System.out.println( angka1 - angka2);
                break;
            case '*':
                System.out.println(angka1 * angka2);
                break;
            case '/': 
                System.out.println( (float) angka1 / angka2);
                break;
        
            default:
                break;
        }

    }
}

