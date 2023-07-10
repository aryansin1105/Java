
public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            if(rear == -1 && front == -1){
                return true;
            }else{
                return false;
            }
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1)
            front = 0;
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = -1;
                front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("no element");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String arg[]){
        Queue obj = new Queue(6);
        obj.add(1);
        obj.add(2);
        obj.add(3);//front
        obj.add(4);
        obj.add(5);
        obj.remove();
        obj.add(6);//at the last index
        obj.add(7);//at the 0 index
        obj.remove();
        while(!obj.isEmpty()){
            System.out.println(obj.peek());
            obj.remove();
        }
    }
}
