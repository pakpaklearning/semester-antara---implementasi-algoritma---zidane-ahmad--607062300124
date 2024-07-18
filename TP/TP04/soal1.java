package TP04;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat : ");
        int angka = s.nextInt();
        String namaBulan;
        
        switch (angka % 12) {
            case 1:
                namaBulan = "janvier";
                break;
            case 2:
                namaBulan = "Fevrier";
                break;
            case 3:
                namaBulan = "Mars";
                break;
            case 4:
                namaBulan = "Avril";
                break;
            case 5:
                namaBulan = "Mai";
                break;
            case 6:
                namaBulan = "Juin";
                break;
            case 7:
                namaBulan = "Juillet";
            case 8:
                namaBulan = "Aout";
                break;
            case 9:
                namaBulan = "Septembre";
                break;
            case 10:
                namaBulan = "Octobre";
                break;
            case 11:
                namaBulan = "Novembre";
                break;
            case 12:
                namaBulan = "Decembre";
                break;
            default:
            namaBulan = "Tidak Valid";
                break;
            }
            System.out.println(""+namaBulan);

    }
}
