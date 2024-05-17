import java.util.Scanner;

public class InsertionSort {
      public static void Insertionsort(int arr[], int n){
            for(int i=0; i<n; i++){
                int current = arr[i]; //element selected from unsorted part
                int j = i-1; //took sorted part's last element
                while (j >= 0 && current < arr[j]) { // comparing sorted with unsorted
                    arr[j+1] = arr[j]; // making place to push
                    j--;
                }

                //placement
                arr[j+1] = current;
                System.out.print("After Insertion Sort: "+current);
            }
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

        Insertionsort(arr, n);
    }
}

// Enter array length:
// 5
// Enter arrary elments:
// 7 8 3 1 2
// After Bubble Sort: 
// 1 2 3 7 8 