import java.util.ArrayDeque;
import java.util.Queue;

public class solution {

    public static void main(String[] args) {
        
        
        Queue<Integer> q = new ArrayDeque<>();

        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(q.size());
        System.out.println(q);

        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());





    }
}