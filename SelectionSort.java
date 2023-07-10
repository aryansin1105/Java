//Selection Sort
public class SelectionSort {
    public static void main(String args[]) {
      int arr[] = {3,6,2,1,9,4};
      for(int i=0;i<5;i++){
            int small = i;
          for(int j=i+1;j<6;j++){
            if(arr[small]>arr[j]){
                small = j;
            }
    }
    int temp = arr[i];
    arr[i] = arr[small];
    arr[small] = temp;
    }
    System.out.println("Sorted Array");
    for(int i=0;i<6;i++){
        System.out.print(arr[i] + " ");
    }
}
}