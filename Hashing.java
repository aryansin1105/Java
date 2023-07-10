import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String arg[]){
        HashSet<Integer> set = new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//repeated element 

        // //print element
        // System.out.println(set);

        // //search - contains
        // if(set.contains(1))
        // System.out.println("Set contain 1");
        // if(set.contains(4))
        // System.out.println("Set not contain 4");

        // //delete
        // set.remove(1);
        // if(!set.contains(1))
        // System.out.println("does not contain 1");

        // //size
        // System.out.println("size : " + set.size());

        //iterator
        Iterator it = set.iterator();

        //hasNext; next 
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
