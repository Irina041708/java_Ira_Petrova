package DZ3;
import java.util.ArrayList;
import java.util.Scanner;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Zad2 {
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
        getResultArray(args);
        System.out.println("");
        System.out.println("Список целых чисел,из которого удалили все четные числа");
        printResultArray(args);
        input.close();  
    }


    public static void getResultArray(String[] args)  {
        for(int i=0;i< resultArray.size();i++){
            if((resultArray.get(i)) % 2 == 0){
                     resultArray.remove(i);
                }
        }
    }


    public static void printResultArray(String[] args)  {
        for (var el : resultArray) {
            System.out.print(el+" ");
        } 
    }
}
