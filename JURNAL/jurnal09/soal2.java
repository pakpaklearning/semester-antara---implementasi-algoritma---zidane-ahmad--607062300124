package jurnal09;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        if (input > 1) {
            for (int i = 1; i <= input; i++) {
                System.out.print(i + " "); 

                for (int j = 1; j <= 10; j++) { 
                    int perkalian = i * j;
                    System.out.print(perkalian + " ");
                }
                System.out.println(); 
            }
        } else {
            System.out.println("masukan selain 0");
        }
        
        s.close();
    }
}
