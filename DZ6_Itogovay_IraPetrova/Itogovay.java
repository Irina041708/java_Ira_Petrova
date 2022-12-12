package DZ6_Itogovay_IraPetrova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//  отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Вывести в виде.
// |Имя| Критерий|
// |----|-----------|
// | Asus | 2ГБ |
// | HP | 4ГБ |
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. 
// (По возрастанию имени ноутбука в алфавитном порядке, по цене по убыванию)

// https://www.techiedelight.com/ru/difference-between-list-set-map-interface-java/
// http://developer.alexanderklimov.ru/android/java/set.php
// https://metanit.com/java/tutorial/3.1.php
// https://github.com/OlegThomasLyasov/JavaAll
//https://metanit.com/java/tutorial/10.3.php             !!!!!


public class Itogovay {
    public static Nout Nout1 = new Nout("Xiaomi RedmiBook 14 II","16 ГБ DDR4 3200 МГц","512 ГБ", "Windows 10 Home Chinese Edition","white",150000);
    public static Nout Nout2 = new Nout("HP Spectre X360", "RAM 16 ГБ (3200 МГц)", "512 ГБ", "Windows 10 Home","grey", 500000);
    public static Nout Nout3 = new Nout("Apple MacBook Air 13 ","8 ГБ","256 ГБ","macOS","black", 410000);

    public static void main (String[] args){
    Scanner user_Input = new Scanner(System.in);
    String menu = "Меню:"
        + System.lineSeparator() + "1 - Имя ноутбука и его ОЗУ"
        + System.lineSeparator() + "2 - Имя ноутбука и его SSD"
        + System.lineSeparator() + "3 - Имя ноутбука и его операционная система"
        + System.lineSeparator() + "4 - Имя ноутбука и его цвет"
        + System.lineSeparator() + "5 - Вывод всех ноутбуков и их характеристик"
        + System.lineSeparator() + "6 - Вывод всех ноутбуков по убыванию стоимости";
    System.out.println(menu);
    System.out.println( "Введите цифру, соответствующую необходимому критерию выбора:");
    Integer operation = user_Input.nextInt();
    Operation(operation);
    user_Input.close();
    }

    public static void Operation(int operation) {
    Stream<Nout> NoutStream = Stream.of(Nout1,Nout2,Nout3);
    if(operation == 1){
        NoutStream
            .flatMap(p->Stream.of(
                String.format("НАЗВАНИЕ НОУТБУКА: %s  OZU: %s", p.getName(), p.getOZU())      
            ))
            .forEach(s->System.out.println(s));
    }
    else if(operation == 2){
        NoutStream
            .flatMap(p->Stream.of(
                String.format("НАЗВАНИЕ НОУТБУКА: %s  SSD: %s", p.getName(), p.getSSD())      
            ))
            .forEach(s->System.out.println(s));
    }
    else if(operation == 3){
        NoutStream
            .flatMap(p->Stream.of(
                String.format("НАЗВАНИЕ НОУТБУКА: %s  ОПЕРАЦИОННАЯ СИСТЕМА: %s", p.getName(), p.getOperatingSystem())      
            ))
            .forEach(s->System.out.println(s));
    }
    else if(operation == 4){
        NoutStream
            .flatMap(p->Stream.of(
                String.format("НАЗВАНИЕ НОУТБУКА: %s  ЦВЕТ: %s", p.getName(), p.getColor())      
            ))
            .forEach(s->System.out.println(s));
    }
    else if(operation == 5){
        HashSet<Nout> allNout = new HashSet<>(Arrays.asList(Nout1,Nout2,Nout3));
        for(Nout Nout : allNout){
            Nout.PrintInfo();
        }
    }
    else if(operation == 6){
        NoutSort NoutSort1 = new NoutSort(Nout1.Name_, Nout1.price_);
        NoutSort NoutSort2 = new NoutSort(Nout2.Name_, Nout2.price_); 
        NoutSort NoutSort3 = new NoutSort(Nout3.Name_, Nout3.price_);
        List<NoutSort> userList = new ArrayList<>(Arrays.asList(NoutSort1, NoutSort2, NoutSort3)); 
        for(NoutSort NoutSort : userList){
            NoutSort.PrintInfo();
        }
        List<NoutSort> sortedList = userList.stream() 
            .sorted(Comparator.comparingInt(NoutSort::getPrice2())) 
            .collect(Collectors.toList()); 
        
        sortedList.forEach(System.out::println); 

        // List<Integer> list = Arrays.asList(Nout1.price_,Nout2.price_,Nout3.price_);
        //// https://rukovodstvo.net/posts/id_576/ 

        // List<Integer> sortedList = list.stream() 
        // .sorted(Collections.reverseOrder()) 
        // .collect(Collectors.toList()); 
        
        // System.out.println(sortedList); 
        // System.out.println("Неотсортированный список" + list); 
        //// list.stream().sorted().forEach(s->System.out.print( s+" "));
        
        


        // NoutStream
        //     .sorted(new NoutComparator())
        //     .forEach(p->System.out.printf("%s (%s) - %t \n",p.getName(), p.getPrice()));
        // NoutStream
        //     .sorted()
        //     .flatMap(p->Stream.of(
        //         String.format("НАЗВАНИЕ НОУТБУКА: %s  Price: %s", p.getName(), p.getPrice())      
        //     ))
        //     .forEach(s->System.out.println(s));   
    }
    
    else
    System.out.println("Вы допустили ошибку при вводе операции. Попробуйте ещё раз"); 
    }
}
// class NoutComparator implements Comparator<Nout>{
  
//     public int compare(Nout a, Nout b){
      
//         return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
//     }
// }
   
    // Nout1.PrintInfo();
    // Nout2.PrintInfo();
    // Nout3.PrintInfo();
    //////////////
     // Выводим только одну позицию из списка
    // Stream<Nout> NoutStream = Stream.of(Nout1,Nout2,Nout3);
    // NoutStream
    //     .map(p-> p.getName())
    //     .forEach(s->System.out.println(s));   
   