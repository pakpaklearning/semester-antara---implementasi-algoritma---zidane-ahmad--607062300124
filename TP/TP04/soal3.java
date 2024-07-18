package TP04;
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan bangun datar pertama : ");
        String bangunDatar = s.nextLine();
        int luas = 0;
        int keliling = 0;        
    
        switch (bangunDatar) {
            case "persegi":
                int sisi = s.nextInt();
                keliling = sisi * 4;
                luas = sisi * sisi;
                System.out.print(luas);
                System.out.println(keliling);
                break;
            case "segitiga":
                int alas = s.nextInt();
                int tinggi = s.nextInt();
                int miring = (int) Math.sqrt((alas * alas) + (tinggi * tinggi));
                keliling = miring * 2 + alas;
                luas = alas * tinggi / 2;
                System.out.println(luas);
                System.out.println(keliling);
                break;
            case "persegi panjang":
                int panjang = s.nextInt();
                int lebar = s.nextInt();
                keliling = (panjang * 2) + (lebar * 2);
                luas = panjang * lebar;
                System.out.println(luas);
                System.out.println(keliling);
                break;
            case "lingkaran":
                double diameter = s.nextInt();
                double kelilingLingkaran = 3.14 * diameter;
                double jariJari = diameter / 2;
                double luasLingkaran = 3.14 * (jariJari * jariJari);
                System.out.println(luasLingkaran);
                System.out.println(kelilingLingkaran);
                break;
            default:
                break;
        }
    
        
    }
}
