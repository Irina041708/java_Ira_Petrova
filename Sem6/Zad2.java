package Sem6;

import java.util.*;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24. 
// 2. Создайте метод, в который передайте заполненный выше массив 
// и с помощью Set вычислите процент уникальных значений в данном массиве 
// и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.


public class Zad2 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        FillMas(arr);
        Get(arr); 
    }
    public static void FillMas(ArrayList<Integer> arr) {
        Random random = new Random();
        for(int i=0;i<1000;i++){
            arr.add(random.nextInt(25));
        }

    }
    public static void Get(ArrayList<Integer> arr) {
        HashSet<Integer> set = new HashSet<>(arr);//пр6евратить в коллекцию
        for(Integer integer : set){
            System.out.print(integer + " ");
        }
        System.out.println(" ");
        System.out.println((double)(set.size()*100)/arr.size());
    }
}

