package DZ1;
import java.util.Scanner;


// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Zad1 {

        public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        Integer name = iScanner.nextInt();
        int[] arr = new int[name]; //Создаем массив
        FillMas(arr);//печатаем массив
        PrintMas(arr);
        SumMas(arr);
        MultiMas(arr);
        iScanner.close();
    }


    public static void FillMas(int[] array){
        for(int i = 1; i < array.length; i++){
            array[i] = (i*(i+1))/2; //формула треугольного числа
        }
    }


    public static void PrintMas(int[] array){
        for(var el : array){
            System.out.print(el + " ");//Чтобы вывести массив в консоли, необходимо перебрать все елементы массива
        }
        System.out.println();
    }


    public static void SumMas(int[] array){
        int sum = 0;
        for(int i = 1; i < array.length; i++){
            array[i] = (i*(i+1))/2; //формула треугольного числа
            sum = sum + array[i];
        }
        System.out.println();
        System.out.println("Сумма равна");
        System.out.println(sum);
    }


    public static void MultiMas(int[] array){
        int multi = 1;
        for(int i = 1; i < array.length; i++){
            array[i] = (i*(i+1))/2; //формула треугольного числа
            multi = multi * array[i];
        }
        System.out.println();
        System.out.println("Произведение равно: ");
        System.out.println(multi);
        System.out.println();
    }
    
}
