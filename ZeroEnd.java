import java.util.*;
public class ZeroEnd {
    public static void main(String args[]) {
      try (Scanner sc = new Scanner(System.in)) {
        int group[][] = new int[3][10];
          int count[][] = new int[3][1];
          int index[][] = new int[3][1];
          System.out.println("Enter the marks of student : ");
          for(int i=0;i<3;i++){
              for(int j=0;j<10;j++){
                  int x = sc.nextInt();
                  if(x == 0){
                      count[i][0]++;
                  }else if(x > 0 && x <= 20){
                  	    group[i][index[i][0]] = x;
                  	    index[i][0]++;
                }else{
                    System.out.println("Enter valid marks");
                    System.exit(0);
                }
             }
          }
          for(int i=0;i<3;i++){
          while(count[i][0] != 0){
            group[i][index[i][0]] = 0;
            index[i][0]++;
            count[i][0]--;
          }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.print(group[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
}