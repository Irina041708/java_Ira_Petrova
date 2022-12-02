package DZ2;
// import java.lang.System.Logger;-не подходит!!!!!!!!!!!
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;

// Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *)
// https://vertex-academy.com/tutorials/ru/konsolnyj-kalkulyator-java/
// К калькулятору из предыдущего дз добавить логирование.


public class Zad4 {
    public static void main(String[] args) throws IOException {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Integer numberA = iScanner.nextInt();
        System.out.print("Введите второе число: ");
        Integer numberB = iScanner.nextInt();
        System.out.print("Выберите и введите одну из операций '+','-','*','/':       ");
        Character operation = iScanner.next().charAt(0);
        Operation(numberA,numberB,operation);
        Logger(args);
        iScanner.close();
    }


    public static void Logger(String[] args) throws IOException {
        try{
            Logger logger = Logger.getLogger(Zad4.class.getName());
            // ConsoleHandler cinfo = new ConsoleHandler();//вывод на консоль
            
            FileHandler finfo = new FileHandler("E:/GeekBrains/8-java/java_proects/DZ2/log_Zad4.xml");
            // logger.addHandler(cinfo);
            logger.addHandler(finfo);

            XMLFormatter xml = new XMLFormatter();
            finfo.setFormatter(xml);

            logger.log(Level.WARNING,"Важно");
            // logger.info("Тестовое логирование");
        } catch (Exception e){
            System.out.println("catch");
        }
        finally
        {System.out.println("finally");}
    }

    
    public static void Operation(int numberA,int numberB,char operation) {
        if(operation == '+'){
            int result = numberA + numberB;
            System.out.println(result);
            }
        else if(operation == '-'){
            int result = numberA - numberB;
            System.out.println(result);
            }
        else if(operation == '*'){
            int result = numberA * numberB;
            System.out.println(result);
            }
        else if(operation == '/'){
            double result = (double) numberA / numberB;
            System.out.printf("%.2f",result);
            }
        else
        System.out.println("Вы допустили ошибку при вводе операции. Попробуйте ещё раз"); 
    }
}
