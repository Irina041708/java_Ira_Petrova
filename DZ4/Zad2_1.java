package DZ4;

import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
// https://www.youtube.com/watch?v=PvDoT79oHTs



public class Zad2_1 {
    public static LinkedList<String> qq = new LinkedList<String>();
    public static void main (String[] args){
        inputuser(args);
        enqueue(args);
        dequeue(args);
        first(args);   
    }
    public static void inputuser(String[] args){
        qq.add("lll");
        qq.add("22");
        qq.add("33");
        System.out.println(qq + " - изначальный  LinkedList");
    }
    public static void enqueue(String[] args){
        String Element = "500"; 
        System.out.println(" ");
        System.out.println(Element + " - помещаемый элемент в конец очереди ");
        qq.addLast(Element );
        System.out.println(qq + " - проверяем, добавлен ли элемент в конец очереди ");
    }
    public static void dequeue(String[] args){
        System.out.println(" ");
        System.out.println(qq.removeFirst() + " - первый элемент из очереди, который возвратим и удалим");
        System.out.println(qq + " - проверяем, удалили ли первый элемент из очереди");
    }
    public static void first(String[] args){
        System.out.println(" ");
        System.out.println(qq.getFirst() + " - Возвращаем первый элемент из очереди, не удаляя.");
        System.out.println(qq + " - проверим, что первый элемент в очереди не удалили" );
    }
}
