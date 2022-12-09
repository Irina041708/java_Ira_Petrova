package Sem4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Zad1 {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        ArrayList<Integer> arraylist = new ArrayList();
        for(int i = 0; i < 10000; i++){
            arraylist.add(i);
        }
        Long end = System.currentTimeMillis();
        System.out.println(String.format(":%d", end-start));

        Long start2 = System.nanoTime();
        LinkedList<Integer> linkedrrayList = new LinkedList<>();
        start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            linkedrrayList.add(i);
        }
        Long end2 = System.currentTimeMillis();
        System.out.println(String.format(":%d", end-start));
    }
}
