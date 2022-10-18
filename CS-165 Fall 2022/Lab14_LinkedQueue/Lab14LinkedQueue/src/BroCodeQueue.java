import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BroCodeQueue {


    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        System.out.print("\n--------------------------------------------------\n");

        System.out.println(q.offer("sally"));
        System.out.println(q.offer("bob"));
        System.out.println(q.offer("steve"));
        System.out.println(q.offer("larry"));

        System.out.println(q);

        q.add("thing1");
        q.add("thing2");
        q.add("thing3");
        q.add("thing4");
        q.add("thing5");

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());


        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());


        System.out.print("\n--------------------------------------------------\n");
    }


}
