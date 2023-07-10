import java.util.*;
class Linked{
    public static void main(String arg[]){
        LinkedList<Integer> ll = new LinkedList<>();
        
        //adding

        ll.add(10);
        ll.add(20);
        ll.add(30);

        //printing

        System.out.println(ll);

        //delete

        ll.remove(1);
        System.out.println(ll);

        //size
        System.out.println(ll.size());

        //heterogeneos list

        LinkedList list = new LinkedList<>();
        list.add("hello");
        list.add(10);
        list.add(true);
        list.add(null);
        System.out.println(list);

        //addFirst && addLast
        
        list.addFirst("python");
        list.addLast("world");
        System.out.println(list);

        //removeLast && removeFirst

        list.removeFirst();
        list.removeLast();
        // list.removeAll();
        System.out.println(list);

        //clear ->clears all element/list
        // list.clear();

        //shadowing of list or cloning

        LinkedList copyList = new LinkedList<>();
        copyList = (LinkedList) list.clone();
        System.out.println(copyList);

        //contains

        if(list.contains(10))
        System.out.println("it contains 10");
        else
        System.out.println("it does not contain 10");

        //peak method retrieves the head element
        System.out.println(list.peek());

        //list iterator
        ListIterator list_Iter = list.listIterator(2);
        while(list_Iter.hasNext()){
            System.out.println(list_Iter.next());
         }

         //poll ->method retrieve head element and remove it
         System.out.println(list.poll());

         //push ->this method is used to push element onto the stack
         LinkedList<String> stack = new LinkedList<>();
         stack.push("I");
         stack.push("am");
         stack.push("iron man");
         System.out.println(stack);
         System.out.println(stack.pop());

         //Convert LinkedList into an Array the method has no parameter
         LinkedList<Integer> obj = new LinkedList<>();
         obj.add(10);
         obj.add(20);
         obj.add(30);
         Object[] a = obj.toArray();
         for(Object elements:a)
            System.out.print(elements+" ");

        //updating ->set
        list.set(1,"C++");
        System.out.println("\n"+list);
    }
}