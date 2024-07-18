package TP04;
import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int angka = s.nextInt();
        String hariIni = "Vendredi";


         String hasilHari;

         switch (angka % 7) {
            case 1: 
                hasilHari = "Samedi";
                break;
            case 2: 
                hasilHari = "Dimance";
                break;
            case 3:
                hasilHari = "Lundi";
                break;
            case 4:
                hasilHari = "Mardi";
                break;
            case 5:
                hasilHari = "Mecredi";
                break;
            case 6:
                hasilHari = "Jeudi";
                break;
            case 7:
                hasilHari = "Vendredi";
                break;
            default:
                hasilHari = "Tidak Valid";
                break;
         }
         System.out.println(""+hasilHari);
    }
}   
