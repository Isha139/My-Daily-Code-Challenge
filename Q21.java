import java.util.*;
public class Q21 {
    public static void SelectionSort(int arr[], int n){
        
        for(int i=0; i<n-1; i++){
            int smallest = i;

            for(int j = i+1; j<n; j++){ // because we assumed the i's first element to be the smallest so we started from i+1 index
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After Bubble Sort: ");
          for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
          }
          System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter arrary elments:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        SelectionSort(arr, n);
    }
}


// Enter array length:
// 5
// Enter arrary elments:
// 7 8 3 1 2
// After Bubble Sort: 
// 1 2 3 7 8 