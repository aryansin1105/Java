public class LL{
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        Node temp = head;
        Node temp1 = head.next;
        while(temp1.next != null){
            temp = temp.next;
            temp1 = temp1.next;
        }
        temp.next = null;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String arg[]){
        head = null;
        LL obj = new LL();
        obj.addFirst("Hello ");
        obj.addFirst("Python ");
        obj.addLast("World");
        // obj.addLast(" And");
        // obj.addFirst("Konichiwa ");
        obj.deleteFirst();
        obj.deleteLast();
        obj.display();
    }
}