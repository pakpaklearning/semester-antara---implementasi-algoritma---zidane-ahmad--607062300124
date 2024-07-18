package jurnal05;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("lirik lagu:");
        String lirik = s.nextLine();
        
        int panjangLirik = lirik.length();
        int sisaBagi = panjangLirik % 5;
        
        char vokalPengganti;
        switch (sisaBagi) {
            case 0:
                vokalPengganti = 'a';
                break;
            case 1:
                vokalPengganti = 'e';
                break;
            case 2:
                vokalPengganti = 'i';
                break;
            case 3:
                vokalPengganti = 'o';
                break;
            case 4:
                vokalPengganti = 'u';
                break;
            default:
                vokalPengganti = 'a'; 
        }
        
        String lirikDiubah = gantiVokal(lirik, vokalPengganti);
        
        System.out.println(lirikDiubah);
        
        s.close();
    }
    
    public static String gantiVokal(String lirik, char vokalPengganti) {
        return lirik.replaceAll("[AEIOUaeiou]", Character.toString(vokalPengganti));
    }
}

