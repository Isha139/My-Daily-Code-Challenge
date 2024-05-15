import java.util.*;
public class Q20 {

    public static void bubbleSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
    
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
          }

          System.out.println("After Bubble Sort: ");
          for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
          }
          System.out.println();
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Array length:");
      int n = sc.nextInt();
      
      int arr[] = new int[n];

      System.out.println("Enter array elements: ");
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }

    // int arr[] = {7,8,3,1,2};
    // int n = arr.length;
      bubbleSort(arr, n);
    }
}

// Enter Array length: 5

// Enter array elements: 7 8 3 1 2

// After Bubble Sort: 1 2 3 7 8
