package Sem2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Задание №5
// Напишите метод, который вернет содержимое текущей папки в виде 
// массива строк. 
// Напишите метод, который выведет массив, возвращенный предыдущим 
// методом в файл. 
// Обработайте ошибки с помощью try-catch конструкции. В случае 
// возникновения исключения, оно должно записаться в лог-файл.
// https://metanit.com/java/tutorial/6.11.php


public class Zad5 {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        // String name = iScanner.next();
        // System.out.println(FillFile(name));
        // FillFile();
        File folder = new File("E://GeekBrains/8-java/java_proects/
        Sem2"); //определяем объект для каталога
        StringBuilder allFiles = GetFiles(folder);
        System.out.println(allFiles.toString());
        
        // iScanner.close(); 
    }

    public static StringBuilder GetFiles(File folder) {
        StringBuilder allFiles = new StringBuilder();
        for(File fileEntry : folder.listFiles()){
            allFiles.append(fileEntry.getName());
        }
        return allFiles;
    }
}
