package Sem1;
import java.util.Scanner;


//Вынесем решение в отдельную функцию return  не забываем, что будет возвращать!!!

// Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести
// максимальное количество подряд идущих 1.
// Найти максимальное количество подряд идущих одинаковых
// элементов массива. (постараться сделать с одним циклом)


public class Zad4 {
    
    public static void main(String[] args) {
        int[] arr = new int[5]; //Создаем массив
        FillMas(arr);//печатаем массив
        PrintMas(arr);
    }
    public static void FillMas(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*2); //Зададим рандомное число, не будем вводить с клавиатуры от 0 до 2 не включая
        }
 
    }
    public static void PrintMas(int[] array){
        for(var el : array){
            System.out.print(el + " ");//Чтобы вывести массив в консоли, необходимо перебрать все елементы массива
        System.out.println();//Чтобы не сливалось
        }
 
    }
}
