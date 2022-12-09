package Sem5;

import java.util.TreeMap;

// Взять набор строк, например,Мороз и солнце день чудесный 
// Еще ты дремлешь друг прелестный Пора красавица проснись.
// Написать метод, который отсортирует эти строки по длине с помощью TreeMap. 
// Строки с одинаковой длиной не должны “потеряться”.
//   https://javarush.com/groups/posts/2584-osobennosti-treemap
//   https://metanit.com/java/tutorial/5.9.php


public class Zad3 {
    public static void main(String[] args) {
        SortMap();
    }
    public static void SortMap(){
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
        TreeMap<Double, String> list = new TreeMap<>();
        String[] sMas = s.split(" ");
        System.out.println(sMas.length);
        for(int i = 0; i < sMas.length;i++){
            if (list.containsKey((double)sMas[i].length())){
                list.put(sMas[i].length() + 0.000001 * i, sMas[i]);
            }
            else{
                list.put ((double)sMas[i].length(),sMas[i]);
            }
        }
        for (var el : list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        } 
    }
}
