package Sem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad1 {
    // https://habr.com/ru/post/339656/  - ссылки на разницы MAP листов
    // https://javarush.com/groups/posts/2584-osobennosti-treemap
    // https://metanit.com/java/tutorial/5.8.php
    public static void main(String[] args) {
        Map<Integer, String> list = new HashMap<>();
        //String encoding = System.getProperty("console");
        Scanner iScanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("Введите паспорт и фамилию через пробел:");
            String s = iScanner.nextLine();
            String[] sMas = s.split("");
            list.put(Integer.parseInt(sMas[0]),sMas[1]);
        }
        for(var el: list.entrySet()){
            System.out.println(el.getKey() + "" + el.getValue() + "\n" );
        }
        for(var el: list.entrySet()){
            if(el.getValue().equals("Иванов")){
                System.out.println(el.getKey() + "" + el.getValue() + "\n" );
            }
        }
        iScanner.close();
    }

}
