package Sem1;
import java.util.Scanner;


// Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести
// максимальное количество подряд идущих 1.
// Найти максимальное количество подряд идущих одинаковых
// элементов массива. (постараться сделать с одним циклом)


public class Zad3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);//Считываем данные с консоли
        int[] arr = new int[5]; //Создаем массив
       
        for(int i = 0; i < arr.length; i++){
           System.out.print("Введите число массива: "); 
           int num = iScanner.nextInt();//Считывем с клавиатуры число и закидываем в переменную
           arr[i] = num; //Закидываем все это в массив
        }

        for(var el : arr){
            System.out.print(el + " ");//Чтобы вывести массив в консоли, необходимо перебрать все елементы массива
        }


        iScanner.close();
    }
}
