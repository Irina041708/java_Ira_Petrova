package Sem2;
import java.util.Scanner;


public class Zad1 {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int kol = iScanner.nextInt();
        System.out.println(FillStringName(kol));
        iScanner.close();  
    }

    public static String FillStringName(int kol) {
        String c1 = "Oleg";
        String c2 = "Vasya";
        String res = new String();
        for(int i = 0; i < kol; i++){
            // if (i % 2 == 0) res = res + c1;
            // else res = res + c2;
            res = i%2 == 0 ? res+c1 : res+c2;
        }
        return res;
    }
}
