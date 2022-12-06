package DZ3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.
//  Формат сдачи: ссылка на гит

public class Zad3 {
    public static ArrayList<Integer> resultArray = new ArrayList<Integer>(); 
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        Integer size = input.nextInt();
        Integer userArray[] = new  Integer[size];
        System.out.println("Заполняем массив целыми числами через пробел");
        for (int i = 0; i < size;i++){
            userArray[i] = input.nextInt();
        } 
        System.out.println("Выводим элементы массива в консоль");
        for (int i = 0; i < size;i++){
            resultArray.add(userArray[i]);
        }
        System.out.print(resultArray);
        System.out.println("");
        getResultArray(args);
        getResultArray2(args);
        input.close();  
    }

    public static void getResultArray(String[] args)  {
        Integer max = Collections.max(resultArray);
        Integer min = Collections.min(resultArray);
        Integer average = (Math.abs(max) + Math.abs(min))/2;
        System.out.println("");
        System.out.println("С помощью встроенных методов");
        System.out.println("Максимальное число в списке:" + max);
        System.out.println("Минимальное число в списке:" + min);
        System.out.println("Среднее число в списке:" + average);  
    }


    public static void getResultArray2(String[] args)  {
        Integer max = 0;
        Integer min = 0;
        for (int i = 0; i < resultArray.size(); i++){
            if((resultArray.get(i)) > max){
                max = resultArray.get(i);
            }
            if((resultArray.get(i)) < min){
                min = resultArray.get(i);
            }
        }
        Integer average = (Math.abs(max) + Math.abs(min))/2;
        System.out.println("");
        System.out.println("Методом циклов");
        System.out.println("Максимальное число в списке:" + max);
        System.out.println("Минимальное число в списке:" + min);
        System.out.println("Среднее число в списке:" + average); 
    }
}
