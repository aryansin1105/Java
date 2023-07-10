import java.util.*;
public class Marks {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of student : ");
      int size = sc.nextInt();
      int marks[] = new int[size];
      System.out.println("Enter the student marks : ");
      for(int i=0;i<size;i++){
        marks[i] = sc.nextInt();
      }
      for(int i=0;i<size;i++){
          System.out.print(marks[i] + " ");
      }
      System.out.println("Peak Numbers : ");
      for(int i=0;i<size-2;i++){
          if(marks[i+1]>marks[i] && marks[i+1]>marks[i+2]){
              System.out.print(marks[i+1] + " ");
          }
      }
    }
}