package latihanPerulangan;

public class soal1 {
    public static void main(String[] args) {

        int papan = 4;
        
        for (int i = 0; i < papan; i++ ){
            for (int j = 0; j < papan; j++ ){
                if ((i+j) % 2 == 0){
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println(); 
        }

    }
}
