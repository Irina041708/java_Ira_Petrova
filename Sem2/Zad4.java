package Sem2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


// Напишите метод, который составит строку, состоящую из 100 
// повторений слова TEST и метод, который запишет эту строку в 
// простой текстовый файл, обработайте исключения
// 


public class Zad4 {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        // String name = iScanner.next();
        // System.out.println(FillFile(name));
        FillFile();
        // iScanner.close(); 
    }

    public static void FillFile() {
        String name = "Тест";
        try{
            FileWriter fw = new FileWriter("1.txt");
            for(int i = 0; i < 100; i++){
                fw.write(name);
                fw.append("\n");//переход на новую строку
            }
            fw.close();
        }catch (IOException ex){
            ex.getMessage();
        } 
    }
}
