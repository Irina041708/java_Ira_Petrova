package DZ2;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.


public class Zad2 {
   
    public static int[] MyArray = {1, 8, 4, 3, 2, 50, 500, -20};
    public static StringBuilder resultMyArray = new StringBuilder();

    public static void main(String[] args) throws IOException {
        getBubble(args);
        getPrintBubble(args);
        Logger(args);     
    }


    public static void getPrintBubble(String[] args) throws IOException {
        for (int el : MyArray) {
            resultMyArray.append(el + " ");
            
        }
        System.out.print(resultMyArray);

    }


    public static void getBubble(String[] args) throws IOException {
        System.out.println(Arrays.toString(MyArray));
        System.out.println(" ");
        for(var i = 0; i < MyArray.length; i++){
            for(var j = 0; j < ( MyArray.length - i -1 ); j++){
                if(MyArray[j] > MyArray[j+1]){
                    var temp = MyArray[j];
                    MyArray[j] = MyArray[j + 1];
                    MyArray[j+1] = temp;  
                }
            }
        }      
    }


    public static void Logger(String[] args) throws IOException {
        try{
            Logger logger = Logger.getLogger(Zad2.class.getName());
            // ConsoleHandler cinfo = new ConsoleHandler();//вывод на консоль
            
            FileHandler finfo = new FileHandler("E:/GeekBrains/8-java/java_proects/DZ2/log_Zad2.xml");
            // logger.addHandler(cinfo);
            logger.setUseParentHandlers(false);//чтобы не выходил лог в консоль
            logger.addHandler(finfo);

            XMLFormatter xml = new XMLFormatter();
            finfo.setFormatter(xml);

            // logger.log(Level.WARNING,"Важно = {}", args);
            logger.info("Тестовое логирование");
        } catch (Exception e){
            System.out.println("catch");
        }
        finally
        {System.out.println("finally");}
    }
}
