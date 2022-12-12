package Sem6;

import java.util.Arrays;
import java.util.HashSet;

public class Zad3 {
    public static void main(String[] args) {
        Cat Barsik = new Cat();
        Barsik.name = "Barsik";
        Barsik.age = 5;
        Barsik.color = "gry";
        Barsik.p = "m";
        Barsik.type = "dvornyaga";
        Barsik.PrintInfo();
              
        
        Cat pushinka = new Cat(10);
        pushinka.PrintInfo();

        Cat puh = new Cat("puh","m","15","white","taxsa");
        Cat puhSec = new Cat("puh","m","15","white","taxsa");
        puh.PrintInfo();


        HashSet<Cat> allCats = new HashSet<>(Arrays.asList(Barsik,pushinka,puh,puhSec));
        for(Cat cat : allCats){
            cat.PrintInfo();
        }


    }
    
}
