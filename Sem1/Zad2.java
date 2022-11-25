package Sem1;
import java.time.LocalTime;
import java.util.Scanner;


//Вынесем решение в отдельную функцию return  не забываем, что будет возвращать!!!


// В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

public class Zad2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = iScanner.next();
        System.out.print("Введите Фамилию: ");
        String fam = iScanner.next();
        System.out.println(NowTime(name, fam));      
        iScanner.close();
    }


    public static String NowTime(String name, String fam) {
        LocalTime nowTime = LocalTime.now();//Создаем переменную данного типа
        // System.out.println(nowTime);
        if(nowTime.isAfter(LocalTime.of(5,00)) && nowTime.isBefore(LocalTime.of(11,59))){
            return "Доброе утро," + name + " " + fam;
            }
        else if(nowTime.isAfter(LocalTime.of(12,00)) && nowTime.isBefore(LocalTime.of(17,59))){
            return "Добрый день," + name + " "  + fam;
        }
        else if(nowTime.isAfter(LocalTime.of(18,00)) && nowTime.isBefore(LocalTime.of(22,59))){
            return "Добрый вечер," + name + " " + fam;
        }
        else
            return "Доброй ночи," + name + " " + fam;

    }

}
