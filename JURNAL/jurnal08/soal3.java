package jurnal08;
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int angka = s.nextInt();
        int angkaSebenarnya = angka;
        int sum = 0;

        // Menghitung jumlah faktorial dari setiap digit
        while (angka > 0) {
            int digit = angka % 10;
            angka /= 10;

            // Menghitung faktorial dari digit
            int faktorial = 1;
            for (int i = 1; i <= digit; i++) {
                faktorial *= i;
            }

            // Menambahkan faktorial ke jumlah
            sum += faktorial;
        }

        if (sum == angkaSebenarnya) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }

    }
}


