package jurnal04;

import java.util.Scanner;

public class soal2 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan hari : ");
        String hari = s.nextLine();

        System.out.println("Masukkan angka : ");
        int angka = s.nextInt();

        int urutan = 0;
        int hasilHari = 0;

        switch (hari) {
			case "Senin" : urutan = 0;
			break;
			case "Selasa" : urutan = 1;
			break;
			case "Rabu" : urutan = 2;
			break;
			case "Kamis" : urutan = 3;
			break;
			case "Jumat" : urutan = 4;
			break;
			case "Sabtu" : urutan = 5;
			break;
			case "Minggu" : urutan = 6;
			break;
		}

        hasilHari = (urutan + angka) % 7;

        switch (hasilHari) {
            case 0: 
            System.out.println("Karena harinya adalah " + hari + ", maka " + angka + " hari berikutnya adalah hari " + "Senin");
                break;
            case 1: 
            System.out.println("Karena harinya adalah " + hari + ", maka " + angka + " hari berikutnya adalah hari " + "Selasa");
                break;
            case 2: 
            System.out.println("Karena harinya adalah " + hari + ", maka " + angka + " hari berikutnya adalah hari " + "Rabu");
                break;
            case 3:
            System.out.println("Karena harinya adalah " + hari + ", maka " + angka + " hari berikutnya adalah hari " + "Kamis");
                break;
            case 4:
            System.out.println("Karena harinya adalah " + hari + ", maka " + angka + " hari berikutnya adalah hari " + "Jumat");
                break;
            case 5:
            System.out.println("Karena harinya adalah " + hari + ", maka " + angka + " hari berikutnya adalah hari " + "Sabtu");
            case 6:
            System.out.println("Karena harinya adalah " + hari + ", maka " + angka + " hari berikutnya adalah hari " + "Minggu");
                break;
            default:
                break;
        }


        
    }
    
}


