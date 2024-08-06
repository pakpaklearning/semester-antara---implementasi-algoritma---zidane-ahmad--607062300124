package jurnal11;

import java.util.Scanner;

public class soal1 {
    public static int hitungPangkat(int A, int N) {
        if (N == 1) {
            return A;
        }
        return A * hitungPangkat(A, N - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int N = s.nextInt();
        
        System.out.println(hitungPangkat(A, N));

    }
}

    

