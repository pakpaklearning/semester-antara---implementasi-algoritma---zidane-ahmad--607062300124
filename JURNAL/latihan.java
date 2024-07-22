import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int angka1 = s.nextInt();
       int angka2 = s.nextInt();
       performComparisonAndLogic(angka1, angka2);
    }   
    public static void performComparisonAndLogic(int a, int b){
        boolean condition1 = (a>0) && (b>0);
        boolean condition2 = (a%2==0) || (b%2==0);

        System.out.println(condition1);
        
        System.out.println(condition2);
        
    } 
       
        }
    

