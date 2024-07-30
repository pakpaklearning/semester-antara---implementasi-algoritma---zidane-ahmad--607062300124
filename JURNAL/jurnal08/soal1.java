package jurnal08;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int R = s.nextInt();
        int N = s.nextInt();
        int hari = 0;
        double zatTersisa = R;

        while (hari < N) {
            zatTersisa /= 2;
            hari += 10;
        }

        System.out.printf("%.3f%n", zatTersisa);

        s.close();
    }
}
