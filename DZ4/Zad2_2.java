package DZ4;
import java.util.Queue;
import java.util.LinkedList;



// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
// https://www.youtube.com/watch?v=PvDoT79oHTs

public class Zad2_2 {
    
    public static void main (String[] args){
        // Queue<Integer> qq = new LinkedList<>();
        Queues q = new Queues(); 
      
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.show(0);
    }
}
