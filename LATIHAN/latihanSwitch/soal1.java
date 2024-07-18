package latihanSwitch;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        String nilai = s.nextLine();

        switch (nilai) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Fail");
                break;
            default:
                break;
        }

        s.close();
    }
    
}
 
