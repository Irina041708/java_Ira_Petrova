package Sem2;
import java.util.Scanner;


// Напишите метод, который сжимает строку. 
// Пример: вход aaaabbbcdd.
// Выход abcd
// charAt(i) и indefOf(s)


public class Zad2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.next();
        System.out.println(CompressString(name));
        iScanner.close();  
    }


    public static String CompressString(String name) {
        String res = "";
        for (int i = 0; i < name.length(); i++){
            if (res.indexOf(name.charAt(i)) == -1){
                //indexOf(): находит индекс первого вхождения подстроки в строку
                //charAt(): возвращает символ строки по индексу
                res += name.charAt(i);
            }
        } 
        return res;
    }
}
