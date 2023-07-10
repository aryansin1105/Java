import java.util.*;
public class QusingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public boolean isEmpty(){
            if(rear == -1){
                return true;
            }else{
                return false;
            }
        }
        public void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("no element");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String arg[]){
        Queue obj = new Queue(6);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        while(!obj.isEmpty()){
            System.out.println(obj.peek());
            obj.remove();
        }
    }
}
