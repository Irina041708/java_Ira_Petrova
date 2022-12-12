package DZ6_Itogovay_IraPetrova;


import java.util.Arrays;
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
        + System.lineSeparator() + "6 - Вывод всех ноутбуков по убыванию стоимости"
        + System.lineSeparator() + "7 - Вывод всех ноутбуков по возрастанию в алфавитном порядке";
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
        HashSet<Nout> allNout = new HashSet<>(Arrays.asList(Nout1,Nout2,Nout3));      
        List<Nout> sortedList = allNout.stream() 
            .sorted(Comparator.comparingInt(Nout::getPrice2).reversed()) 
            .collect(Collectors.toList()); 
        ////Отсортированный список - Ура получилось:)))
        for(Nout NoutSort : sortedList){
            NoutSort.PrintInfo2();
        }
    }
    else if(operation == 7){
        HashSet<Nout> allNout = new HashSet<>(Arrays.asList(Nout1,Nout2,Nout3));      
        ////Неотсортированный список 
        // for(Nout NoutSort : allNout){
        //     NoutSort.PrintInfo();
        // }
        List<Nout> sortedList = allNout.stream() 
            .sorted(Comparator.comparing(Nout::getName2)) 
            .collect(Collectors.toList()); 
        ////Отсортированный список - Ура получилось:)))
        for(Nout NoutSort : sortedList){
            NoutSort.PrintInfo2();
        }
    }
    else
    System.out.println("Вы допустили ошибку при вводе операции. Попробуйте ещё раз"); 
    }
}

//// 1-Если добавить новый класс для сортировки,но этого не надо делать, 
////т.к. там будет все тоже самое.
////2-get по хорошему должен возвращать тот тип, 
////который содержится в поле (Integer, String).
////!!! У меня в getPrice()  был тип Object, а должен был быть тип Integer!!!!!!!!!!!

// else if(operation == 6){
//!!!!!!!!!!!!!!!!!!!!!!!!!В Itogovay.java:
//     NoutSort NoutSort1 = new NoutSort(Nout1.Name_, Nout1.price_);
//     NoutSort NoutSort2 = new NoutSort(Nout2.Name_, Nout2.price_); 
//     NoutSort NoutSort3 = new NoutSort(Nout3.Name_, Nout3.price_);
//     List<NoutSort> userList = new ArrayList<>(Arrays.asList(NoutSort1, NoutSort2, NoutSort3)); 
//     ////Неотсортированный список 
//     for(NoutSort NoutSort : userList){
//         NoutSort.PrintInfo();
//     }
//     List<NoutSort> sortedList = userList.stream() 
//         .sorted(Comparator.comparingInt(NoutSort::getPrice2).reversed()) 
//         .collect(Collectors.toList()); 
//     ////Отсортированный список - Ура получилось:)))
//     for(NoutSort NoutSort : sortedList){
//         NoutSort.PrintInfo();
//     }
// }
//!!!!!!!!!!!!!!!!!!!!!!!!!В Nout.java:
// class NoutSort{
     
//     private Integer price2;
//     private String Name2;
     
//     public NoutSort(String Name, Integer price){
//         this.Name2=Name;
//         this.price2 = price;
//     }

//     public Integer getPrice2() {
//         return price2;
//     }

//     public void PrintInfo() {
//         {
//             System.out.printf("Name: %s \tprice_: %s\n\n ",Name2,price2);
//         }
//     } 
// }
