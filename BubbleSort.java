public class BubbleSort {
    public static void main(String args[]) {
      int arr[] = {3,6,2,1,9,4};
      for(int i=0;i<5;i++){
          for(int j=0;j<5-i;j++){
          if(arr[j]>arr[j+1]){
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
      }
    }
    }
    System.out.println("Sorted Array");
    for(int i=0;i<6;i++){
        System.out.print(arr[i] + " ");
    }
}
}