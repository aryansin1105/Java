public class InsertionSort {
    public static void main(String args[]) {
      int arr[] = {3,6,2,1,9,4};
      for(int i=1;i<6;i++){
        int current = arr[i];
        int j = i-1;
        while(j>=0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current;
      }
    System.out.println("Sorted Array");
    for(int i=0;i<6;i++){
        System.out.print(arr[i] + " ");
    }
}
}