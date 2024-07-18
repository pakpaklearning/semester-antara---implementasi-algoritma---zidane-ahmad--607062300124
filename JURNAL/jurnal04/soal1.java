package jurnal04;

import java.util.Scanner;

class soal1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = s.nextInt();

        switch (angka % 7) {
            case 1:
                System.out.println("Senin");
                break;
            case 2: 
            System.out.println("Selasa");
                break;
            case 3: 
                System.out.println("Rabu");
                break;
            case 4: 
                System.out.println("Kamis");
                break;
            case 5: 
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7: 
                System.out.println("Minggu");
                break;
            default:
                break;
        }

        s.close();
    }
}   
    
