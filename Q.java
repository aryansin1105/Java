import java.util.*;
public class Q {
    public static void main(String arg[]){
        Queue<Integer> queue = new LinkedList<>(); //object sirf classes ki banati hai interfaces ki nhi queue interface hai
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        
        //size
        System.out.println(queue.size());
        
        //clear
        // queue.clear();
        
        //remove
        queue.remove();
        queue.remove(20);//to remove specific element
        System.out.println(queue);

        //insert
        queue.offer(40);
        queue.add(20);
        queue.add(10);
        System.out.println(queue);

        System.out.println(queue.peek());

        // LinkedList implementation of Queue
        Queue<String> animal1 = new LinkedList<>();

        // Array implementation of Queue
        Queue<String> animal2 = new ArrayDeque<>();

        // Priority Queue implementation of Queue
        Queue<String> animal3 = new PriorityQueue<>();

    }
}
