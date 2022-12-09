package Sem4;
import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида 
// text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.


public class Zad2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст:");
        String a = input.nextLine();
        String [] userText = a.split("~");
        if (!userText[0].equals("Print")){
            Integer a = Integer.parseInt(userText[1]);
            list.add(a,"Text");
        }
        else{
            List.remove(userText[1]);
        }      
        iScanner.close();    
    }
}

