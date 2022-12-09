package DZ4;

import java.util.LinkedList;



// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.
// https://yandex.ru/video/preview/2149924156055028724

public class Zad1 {
    public static LinkedList<Object> list = new LinkedList<>();//Создаем LinkedList
    public static LinkedList<Object> rez = new LinkedList<>();//Создаем место в паямти,куда будем записывать результат
    public static void main (String[] args){
        list.add("ghj");
        list.add(5);
        list.add(9);
        System.out.println(list);
        revers (args);
    }
    public static void revers (String[] args){
        for (int i = list.size() - 1; i >= 0; i--) {
            rez.add(list.get(i));
        }
        System.out.println(rez);
    }
}
