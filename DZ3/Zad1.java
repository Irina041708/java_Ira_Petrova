package DZ3;

import java.util.Arrays;

// Реализовать алгоритм сортировки слиянием
//  https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D1%81%D0%BB%D0%B8%D1%8F%D0%BD%D0%B8%D0%B5%D0%BC
// супер- как все объясняет:)))
//https://www.youtube.com/watch?v=tAtBPxw2RRQ
//https://www.youtube.com/watch?v=kqGPz_NwGH4

public class Zad1 {
    public static void main(String[] args){
       Test test = new Test();
       int[] a = {3, 6, 0, 9, 4, 7};
       int[] b = test.sortMerge(a);
       System.out.println(Arrays.toString(a));
       System.out.println(" ");
       System.out.println(Arrays.toString(b));
       System.out.println(" ");
    }
}
