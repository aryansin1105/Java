import java.util.*;
class Arraylist{
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Character> list4 = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
        list2.add("Aryan");
        list2.add("Abhisek");
        list2.add("Sumit");
        for(int i=0;i<list2.size();i++){
            System.out.print(list2.get(i) + " ");
        }
        System.out.println("");
        list3.add(true);
        list3.add(false);
        list3.add(false);
        for(int i=0;i<list3.size();i++){
            System.out.print(list3.get(i) + " ");
        }
        System.out.println("");
        list4.add('a');
        list4.add('b');
        list4.add('c');
        for(int i=0;i<list4.size();i++){
            System.out.print(list4.get(i) + " ");
        }
        // to add element at pos
        list.add(2,40);
        list2.add(2,"Mukesh");
        list3.add(2,true);
        list4.add(2,'d');
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        // set element
        list.set(0,5);// index, element
        System.out.println(list);
        //delete element 
        list.remove(3); // 3-  index
        System.out.println(list);
        //size
        int size = list.size();
        System.out.println(size);
        //sort
        Collection.sort(list);
        System.out.println(list);//acending order
    }
}