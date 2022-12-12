package Sem6;

import java.util.*;

// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества



public class Zad1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 6, 3};
        HashSet<Integer> setH = new HashSet<>();//пр6евратить в коллекцию
        for(int i = 0; i < arr.length; i++){
            setH.add(arr[i]);
        }
        for(Integer integer : setH){
            System.out.print(integer + " ");
        }


        System.out.println(" ");


        LinkedHashSet<Integer> setLink = new  LinkedHashSet<>();
        for(int i = 0; i < arr.length; i++){
            setLink.add(arr[i]);
        }
        for(Integer integer : setLink){
            System.out.print(integer + " ");
        }

        System.out.println(" ");

        TreeSet<Integer> setTree = new  TreeSet<>();
        for(int i = 0; i < arr.length; i++){
            setTree.add(arr[i]);
        }
        for(Integer integer : setTree){
            System.out.print(integer + " ");
        }
    }
}
